package com.springboot.jump.countryApp.controller;


import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.springboot.jump.countryApp.data.CityData;
import com.springboot.jump.countryApp.model.City;

@RestController
@RequestMapping("/t1")
public class CityController {
	
	
	@GetMapping("getAllCities")	
	public List<City> getCities(){
		return CityData.list();
	}
	
	@GetMapping("getAll")	
	public  String getCitiesTest(){
		return CityData.listCities();
	}

}
