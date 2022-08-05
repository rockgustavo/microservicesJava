package com.rockgustavo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class RhUserApplication {

	public static void main(String[] args) {
		SpringApplication.run(RhUserApplication.class, args);
	}

}
