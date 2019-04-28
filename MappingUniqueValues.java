/* 
 * Write a method isUnique that accepts a map whose keys and values are strings as a parameter
 * and returns true if no two keys map to the same value (and false if any two or more keys 
 * do map to the same value.
 */

import java.util.*;

public class MappingUniqueValues {
	
	
	public static void main(String[] args) {
		
		//Create Map
		Map<String, String> map = new HashMap<>();
		
		//Add key, value
		map.put("Marty", "Stepp");
		map.put("Jessica", "Miller");
		map.put("Stuart", "Reges");
//		map.put("Wonny", "Reges");
//		map.put("Makus", "Miller");
	
		
		//Call isUnique method and print returned value (true/false)
		System.out.println(isUnique(map));
		
	}
	
	public static boolean isUnique(Map<String, String> map) {
		
		//Create a set to add the values from the Map
		Set<String> set = new HashSet<String>(map.values());	
		
		//Compare the size of the Map (values only) with the size of the Set 
		//if different, return false
		if(map.values().size() != set.size()) {
			return false;			
		}	 	
		//else, return true
		return true;
}
}
	

