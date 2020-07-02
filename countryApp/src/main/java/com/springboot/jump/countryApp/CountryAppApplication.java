package com.springboot.jump.countryApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;



@SpringBootApplication
@EnableEurekaClient
public class CountryAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(CountryAppApplication.class, args);
	}

}
