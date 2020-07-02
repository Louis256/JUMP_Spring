package com.cognixia.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Size;

@Entity
public class Country {
	
	@GeneratedValue
	@Id
	private int CountryId;
	
	private String CountryName;
	
	private String CapitalCity;
	
	private String Population;
	
	@Size(min = 5, message = "Landmark min length is 5" )
	private String Landmark;

	public int getCountryId() {
		return CountryId;
	}

	public void setCountryId(int countryId) {
		CountryId = countryId;
	}

	public String getCountryName() {
		return CountryName;
	}

	public void setCountryName(String countryName) {
		CountryName = countryName;
	}

	public String getCapitalCity() {
		return CapitalCity;
	}

	public void setCapitalCity(String capitalCity) {
		CapitalCity = capitalCity;
	}

	public String getPopulation() {
		return Population;
	}

	public void setPopulation(String population) {
		Population = population;
	}

	public String getLandmark() {
		return Landmark;
	}

	public void setLandmark(String landmark) {
		Landmark = landmark;
	}

	@Override
	public String toString() {
		return "Country [CountryId=" + CountryId + ", CountryName=" + CountryName + ", CapitalCity=" + CapitalCity
				+ ", Population=" + Population + ", Landmark=" + Landmark + "]";
	}
	
	
	
	
}
