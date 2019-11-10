package com.waplak.pawn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class PawnTwoApplication {

	public static void main(String[] args) {
		SpringApplication.run(PawnTwoApplication.class, args);
	}

}
