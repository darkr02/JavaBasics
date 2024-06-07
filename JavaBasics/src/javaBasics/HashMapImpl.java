package javaBasics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class HashMapImpl {

	public static void main(String[] args) {

		Map <String, List<String>> Countries = new HashMap<>();
		
		
		// List of countries starts with G
		List<String> lstOfCountrieswithG = new ArrayList<>();
		lstOfCountrieswithG.add("Ghana");
		lstOfCountrieswithG.add("Greenland");
		lstOfCountrieswithG.add("Greece");
		
		// List of countries starts with I
		List<String> lstOfCountrieswithI = new ArrayList<>();
		lstOfCountrieswithI.add("India");
		lstOfCountrieswithI.add("Iran");
		lstOfCountrieswithI.add("Ireland");

		// List of countries starts with U
		List<String> lstOfCountrieswithU = new ArrayList<>();
		lstOfCountrieswithU.add("United Kingdom");
		lstOfCountrieswithU.add("United states of America");
		lstOfCountrieswithU.add("Uruguay");
		
		Countries.put("CountriesWithG", lstOfCountrieswithG);
		Countries.put("CountriesWithU", lstOfCountrieswithU);
		Countries.put("CountriesWithI", lstOfCountrieswithI);
		
		
		//Fetch the LIst of countries starting with I
		List<String> lstI = Countries.get("CountriesWithI");
		if(Objects.nonNull(lstI))
		{
			for (String countriesWithI:lstI)
			{
				System.out.println(countriesWithI);
			}
		}
		else
		{
			throw new IllegalArgumentException("List is null");
		}
		
		System.out.println(Countries);
	}

}
