package com.ibm.training.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {
//		Set<String> uniqueWords = new HashSet<>(); //iteration order is different from insertion order
		
//		Set<String> uniqueWords = new LinkedHashSet<>(); //iteration order is same as insertion order
		
		TreeSet<String> uniqueWords = new TreeSet<>();
		
		Scanner kb = new Scanner(System.in);
		
		while(true) {
			System.out.println("Enter a unique word:");
			String aWord = kb.nextLine();
			if(aWord.equalsIgnoreCase("quit")) {
				break;
			}
			boolean added = uniqueWords.add(aWord);
			if(!added) {
				System.out.println("That's a duplicate!");
			}
		}
		
		
		System.out.println("__________________");
		for(String aWord : uniqueWords.descendingSet()) {
			System.out.println(aWord);
		}

	}

}
