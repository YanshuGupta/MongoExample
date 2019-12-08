package com.example.MongoExample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class MongoExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(MongoExampleApplication.class, args);
	}
	
	@GetMapping("/")
	public String index() {
		return "It Looks like web Server is up and running.";
	}
}
