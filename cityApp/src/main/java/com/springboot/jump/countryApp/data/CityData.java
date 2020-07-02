package com.springboot.jump.countryApp.data;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import com.springboot.jump.countryApp.model.City;


public class CityData {
private static final Map<Integer, City> couMap = new HashMap<Integer, City>();
	
	static {
		initCountry();
	}
	
	private static void initCountry() {
		City c1 = new City(1,"United States","Washington, DC");
		City c2 = new City(2,"United States","Boston");
		City c3 = new City(3,"United States","Chicago");
		City c4 = new City(4,"Germany","Munich");
		City c5 = new City(5,"Germany","Berlin");
		City c6 = new City(6,"Canada","Toronto");
		City c7 = new City(7,"Canada","Montreal");
		couMap.put(c1.getId(), c1);
		couMap.put(c2.getId(), c2);
		couMap.put(c3.getId(), c3);
		couMap.put(c4.getId(), c4);
		couMap.put(c5.getId(), c5);
		couMap.put(c6.getId(), c6);
		couMap.put(c7.getId(), c7);

		
	}
	
	public static List<City> list(){			
		return new ArrayList<City>(couMap.values());
	}
	
	public static String listCities(){
		/**
		for(City c: couMap.values()) {
			String country = c.getCountryName();
			if(country==c.getCityName())
			c.getCityName();
		}
		
		List<String> city = new ArrayList();
		for(Map.Entry<String, City> c : couMap.entrySet()) {
			String key = c.getKey();
			City value = c.getValue();
			System.out.println(key);
			if(value.getCountryName()==key) {
				 System.out.println(value);
				 city.add(value.getCityName());
				 
			}
		}return city;
		*/
		
			//ArrayList<City> cs = new ArrayList<City>(couMap.values());
			String str = "<!DOCTYPE html><html><head><style>table{ font-family: arial, sans-serif; border-collapse: collapse; width: 100%; } td, th { border: 1px solid #dddddd; text-align: left; padding: 8px; } tr:nth-child(even) {	background-color: #dddddd; } </style> </head>"
				+ "<body> <h2>Countries</h2> <table> <tr> <th>Country</th>	<th>Cities</th> </tr> ";

			List<String> countryList = new ArrayList<String>();
			for(City c : couMap.values()) 
				if (countryList.isEmpty() || !countryList.contains(c.getCountryName()))
					countryList.add(c.getCountryName());
			
			for(int i = 0; i < countryList.size(); i++) {
				str += "<tr> <td> " + countryList.get(i) + "</td> <td> <ul> ";
				for(City c: couMap.values()) {	
					if (c.getCountryName().equalsIgnoreCase(countryList.get(i)))
						str += "<li>" + c.getCityName() + "</li> ";
				}
				str += "</ul> </td> </tr> ";
			}

			str += "</table> </body> </html>";
			return str;
		
	}



}
