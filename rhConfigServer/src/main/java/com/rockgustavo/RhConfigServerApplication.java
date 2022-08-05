package com.rockgustavo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

import org.springframework.boot.CommandLineRunner;
import org.springframework.beans.factory.annotation.Value;


@EnableConfigServer
@SpringBootApplication
public class RhConfigServerApplication implements CommandLineRunner {

	@Value("${spring.cloud.config.server.git.username}")
	private String username;
	
	public static void main(String[] args) {
		SpringApplication.run(RhConfigServerApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("USER: " + username);
	}

}
