package com.springboot.jump.countryApp.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "data")
public class country {
	private int id;
	private String name;
	private String capital;
	private String population;
	
	public country() {

	}

	public country(int id, String name, String capital, String population) {
		super();
		this.id = id;
		this.name = name;
		this.capital = capital;
		this.population = population;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCapital() {
		return capital;
	}

	public void setCapital(String capital) {
		this.capital = capital;
	}

	public String getPopulation() {
		return population;
	}

	public void setPopulation(String population) {
		this.population = population;
	}
	
	

}
