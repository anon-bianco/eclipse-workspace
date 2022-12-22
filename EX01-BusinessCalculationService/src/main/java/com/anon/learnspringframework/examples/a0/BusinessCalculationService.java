package com.anon.learnspringframework.examples.a0;

import java.util.Arrays;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
@Configuration
public class BusinessCalculationService {
	
	private DataService dataService;
	
	
	
	public BusinessCalculationService(DataService dataService) {
		super();
		this.dataService = dataService;
	}



	public int findMax() {
		return Arrays.stream(dataService.retrieveData()).max().orElse(0);
	}

}