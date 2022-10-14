package com.JdbcTemplate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication

public class JdbcTemplateApplication {

	public static void main(String[] args) {
		SpringApplication.run(JdbcTemplateApplication.class, args);
	}

}
