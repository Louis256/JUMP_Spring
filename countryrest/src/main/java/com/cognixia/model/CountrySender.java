package com.cognixia.model;

import java.util.Date;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CountrySender {
@Bean
public CommandLineRunner sendCountry(@Value("${country.amqp.queue}") String destination, CountryProducer producer) {
	return args -> {
		Country c = new Country();
		c.setCountryName("US");
		c.setCapitalCity("Washington, DC");
		c.setPopulation("331,002,651");
		c.setLandmark("Central Park");
		producer.sendTo(destination, c);
		};
	}
}
