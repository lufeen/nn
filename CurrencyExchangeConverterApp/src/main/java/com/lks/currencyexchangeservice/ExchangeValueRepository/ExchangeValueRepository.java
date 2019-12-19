package com.lks.currencyexchangeservice.ExchangeValueRepository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.lks.currencyexchangeservice.entity.ExchangeValue;



public interface ExchangeValueRepository extends  JpaRepository<ExchangeValue, Long>{

	ExchangeValue findByFromAndTo(String from, String to);
	
}
