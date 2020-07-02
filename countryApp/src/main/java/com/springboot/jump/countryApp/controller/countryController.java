package com.springboot.jump.countryApp.controller;


import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.springboot.jump.countryApp.data.countryData;
import com.springboot.jump.countryApp.model.country;

@RestController
@RequestMapping("/t1")
public class countryController {
	
	
	@GetMapping("getAllCountries")	
	public String getCountry(){
		return countryData.list();
	}
	
	@GetMapping("population/{name}")
	public String getPopulation(@PathVariable("name") String name) {
		return countryData.getPopulationByName(name);
	}				

}
