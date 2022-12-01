package com.paramel.springbootdemo.setup;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController 
public class CurrencyConfiugrationController {
	@Autowired
	private CurrencyServiceConfiguration currencyServiceConfiguration;
	
	@RequestMapping("/config")
	public CurrencyServiceConfiguration retrieveObject() {
		return currencyServiceConfiguration;
		
	}

}
