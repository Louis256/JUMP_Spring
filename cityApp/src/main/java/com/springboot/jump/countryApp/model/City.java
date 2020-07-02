package com.springboot.jump.countryApp.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "data")
public class City {
	private int id;
	private String countryName;
	private String cityName;
	
	
	public City() {

	}
	public City(int id, String countryName, String cityName) {
		super();
		this.id = id;
		this.countryName = countryName;
		this.cityName = cityName;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCountryName() {
		return countryName;
	}
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	
	
	

}
