package com.cognixia.model;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CountryController {
@Autowired
CountryService ts;

	@PostMapping("/Country")
	Country createCountry(@Valid @RequestBody Country country) {
	return ts.createCountry(country);
	}
}
