package com.waplak.pawn.config;

import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

public class Config {
	
	@Bean
	public RestTemplate pawnRestTemplate() {
		
		return new RestTemplate();
	}

}
