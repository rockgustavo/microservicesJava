package com.rockgustavo.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("test")
public class TesteConfig implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {

		
	}


}
