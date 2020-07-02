package com.springboot.jump.countryApp.data;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import com.springboot.jump.countryApp.model.country;

public class countryData {
private static final Map<Integer, country> couMap = new HashMap<Integer, country>();
	
	static {
		initCountry();
	}
	
	private static void initCountry() {
		country c1 = new country(1,"United States","Washington, DC","331,002,650");
		country c2 = new country(2,"China","Beijing","1,394,015,977");
		country c3 = new country(3,"India","New Delhi","1,326,093,247");
		country c4 = new country(4,"Indonesia","Jakarta","267,026,366");
		country c5 = new country(5,"Pakistan","Islamabad","233,500,636");
		couMap.put(c1.getId(), c1);
		couMap.put(c2.getId(), c2);
		couMap.put(c3.getId(), c3);
		couMap.put(c4.getId(), c4);
		couMap.put(c5.getId(), c5);
		
	}
	
	public static String list(){
		//return new ArrayList<country>(couMap.values());
		
		String str = "<!DOCTYPE html><html><head><style>table{ font-family: arial, sans-serif; border-collapse: collapse; width: 100%; } td, th { border: 1px solid #dddddd; text-align: left; padding: 8px; } tr:nth-child(even) {	background-color: #dddddd; } </style> </head>"
				+ "<body> <h2>Countries</h2> <table> <tr> <th>Name</th>	<th>Capital</th> <th>Population</th></tr> ";
	for (country c : couMap.values()){
		str += "<tr> <td>" + c.getName() + "</td> <td>" + c.getCapital() + "</td> <td>" + c.getPopulation() + "</td>  </tr> ";
	}
		str += "</table> </body> </html>";
	return str;
	}
	
	public static String getPopulationByName(String name) {
		country cc1 = new country();
		cc1= couMap.get(name);
		return "The population of "+cc1.getName()+" is: "+cc1.getPopulation();		
	}

}
