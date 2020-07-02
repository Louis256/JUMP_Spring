package com.cognixia.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import com.cognixia.repository.CountryRepository;

@Component
	public class CountryConsumer {
	private static final Logger log = LoggerFactory.getLogger(CountryConsumer.class);
	
	private CountryRepository countryRepos;
	
	public CountryConsumer(CountryRepository repository) {
	this.countryRepos = repository;
	}
	
	@RabbitListener(queues = "${country.amqp.queue}")
	public void processCountry(Country country) {
	
	log.info("Consumer> " + country);
	log.info("ToDo created> " + this.countryRepos.save(country));
	}
}
