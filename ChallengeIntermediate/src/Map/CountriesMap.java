package Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountriesMap {
	public static void main(String [] args) {
		Map<String,String> Country = new HashMap<>();
		
		Country.put("Bharat", "New Delhi");
		Country.put("Pakistan", "Islamabaad");
		Country.put("Bangladesh", "Dhaka");
		Country.put("Chine", "Beijing");
		Country.put("Nepal", "Kathmandu");
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please Enter the Country Name: ");
		String country = input.next();
		
		if(Country.containsKey(country)) {
		 System.out.print("The capital of Country: "+ Country.get(country));
		}
		else {
			System.out.print("Sorry We don't know the capital of your country...");
		}
	}

}
