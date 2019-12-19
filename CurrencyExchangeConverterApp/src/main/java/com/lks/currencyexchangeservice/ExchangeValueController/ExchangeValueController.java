package com.lks.currencyexchangeservice.ExchangeValueController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.lks.currencyexchangeservice.ExchangeValueRepository.ExchangeValueRepository;
import com.lks.currencyexchangeservice.entity.ExchangeValue;

@RestController
public class ExchangeValueController {
	
	@Autowired
	  private ExchangeValueRepository repository;

	@GetMapping("/currency-exchange/from/{from}/to/{to}")
	public ExchangeValue retriveExchangeValue
	(@PathVariable String from, @PathVariable String to){
		
		
		ExchangeValue exchangeValue = 
		        repository.findByFromAndTo(from, to);
		
		 
			    return exchangeValue;
		
		
	}
}
