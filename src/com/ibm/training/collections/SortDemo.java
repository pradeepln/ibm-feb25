package com.ibm.training.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.ibm.training.basics.ChemicalElement;

public class SortDemo {

	public static void main(String[] args) {
		//sortStringArray();
		//sortListOfString();
		
		//sortListOfUserDefinedObj();
		
		//sortListOfStringUsingLength();
	}
	
	private static void sortListOfStringUsingLengthAndAnon() {
		String[] words = {"this","is","a","bunch","of","strange","words","like","zebra","abyss","etc"};
		List<String> wordList = Arrays.asList(words);
		
		System.out.println(wordList);
		
		Collections.sort(wordList, new Comparator<String>() {
			@Override
			public int compare(String s1,String s2) {
				return s1.length() - s2.length();
			}
		});
		
		System.out.println(wordList);
	}

	private static void sortListOfStringUsingLength() {
		String[] words = {"this","is","a","bunch","of","strange","words","like","zebra","abyss","etc"};
		List<String> wordList = Arrays.asList(words);
		
		System.out.println(wordList);
		
		Collections.sort(wordList, new StringLengthComparator());
		
		System.out.println(wordList);
	}

	private static void sortListOfUserDefinedObj() {
		ChemicalElement h = new ChemicalElement(1, "H", "Hydrogen");
		ChemicalElement k = new ChemicalElement(19, "K", "Potassium");
		ChemicalElement o = new ChemicalElement(8, "O", "Oxygen");
		ChemicalElement ga = new ChemicalElement(31, "Ga", "Gallium");
		
		List<ChemicalElement> cList = new ArrayList<>();
		
		cList.add(o); cList.add(h); cList.add(ga); cList.add(k);
		
		System.out.println(cList);
		
		Collections.sort(cList);
		
		System.out.println(cList);
		
	}

	private static void sortListOfString() {
		String[] words = {"this","is","a","bunch","of","strange","words","like","zebra","abyss","etc"};
		List<String> wordList = Arrays.asList(words);
		
		System.out.println(wordList);
		
		Collections.sort(wordList);
		
		System.out.println(wordList);
	}

	private static void sortStringArray() {
		String[] words = {"this","is","a","bunch","of","strange","words","like","zebra","abyss","etc"};
		System.out.println(Arrays.toString(words));
		Arrays.sort(words);
		System.out.println(Arrays.toString(words));
	}

}
