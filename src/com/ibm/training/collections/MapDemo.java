package com.ibm.training.collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class MapDemo {

	public static void main(String[] args) {
		//Map<String, Integer> runsMap = new HashMap<>(); //iteration order is different from insertion order
		
		//Map<String, Integer> runsMap = new LinkedHashMap<>(); //iteration order is same as insertion order
		
		Map<String, Integer> runsMap = new TreeMap<>();
		
		runsMap.put("gill", 56);
		runsMap.put("rohit", 34);
		runsMap.put("bumrah", 91);
		runsMap.put("ashwin", 101);
		
		runsMap.put("gill", 57);
		
		//System.out.println(runsMap);
		Scanner kb = new Scanner(System.in);
		while(true) {
			System.out.println("Enter a batsman name:");
			String name = kb.nextLine();
			
			if(name.equalsIgnoreCase("quit")) {
				break;
			}
			
			if(runsMap.containsKey(name)) {
				int runs = runsMap.get(name);
				System.out.println(name + " scored " + runs + " runs");
			}else {
				System.out.println(name + " did not bat!");
			}
		}
		
		System.out.println("____________________________");
		Set<String> keys = runsMap.keySet();
		
		for(String aKey : keys) {
			System.out.println(aKey + " --------------> " + runsMap.get(aKey));
		}
	}

}
