package com.cognixia.model;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognixia.repository.CountryRepository;

import net.bytebuddy.dynamic.DynamicType.Builder.FieldDefinition.Optional;
import net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.*;
@Service
public class CountryService {
@Autowired
CountryRepository tr;

	public Country createCountry(Country country) {
		return tr.save(country);
	}
}