package com.ibm.training.streams;

import java.util.Arrays;
import java.util.List;

public class StreamsDemo {

	public static void main(String[] args) {
		String[] words = {"this","is","a","bunch","of","strange","words","like","zebra","abyss","etc"};
		List<String> wordList = Arrays.asList(words);
		
		wordList
			.stream()
			.filter(s -> s.length() > 2)
			.forEach(s -> System.out.println(s));
		
		List<String> bigWords = wordList
									.stream()
									.filter(s -> s.length() > 2)
									.toList();
		System.out.println(bigWords);
		
		wordList
			.stream()
			.filter(s -> s.length() > 2)
			.map(s -> s.length())
			.forEach(s -> System.out.println(s));
		
		
	}

}
