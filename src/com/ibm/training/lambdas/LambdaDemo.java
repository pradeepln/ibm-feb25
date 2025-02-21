package com.ibm.training.lambdas;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LambdaDemo {

	public static void main(String[] args) {
		String[] words = {"this","is","a","bunch","of","strange","words","like","zebra","abyss","etc"};
		List<String> wordList = Arrays.asList(words);
		
		System.out.println(wordList);
		
//		Collections.sort(wordList, (String s1,String s2) -> {
//			return s1.length() - s2.length();
//		});
		
//		Collections.sort(wordList, (s1,s2) -> {
//			return s1.length() - s2.length();
//		});
		
		//Collections.sort(wordList, (s1,s2) -> s1.length() - s2.length());
		
		Collections.sort(wordList, (s1,s2) -> s2.length() - s1.length());
		
		System.out.println(wordList);
	}

}
