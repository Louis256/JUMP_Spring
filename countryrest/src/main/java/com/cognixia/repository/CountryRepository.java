package com.cognixia.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.cognixia.model.Country;

@RepositoryRestResource
public interface CountryRepository extends JpaRepository<Country, Integer>{

	//List<Country> findByCountryName(String countryName);
	//List<Country> findByDoneTrue();
	/**
	@Query("select c from Country c where c.CountryName=?1 and c.CaptitalCity=?2") 
Country findByNameAnd (String countryName, String CaptitalCity);

	Country findByUserAndDes(String user, String des);*/
}

