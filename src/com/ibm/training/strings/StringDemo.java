package com.ibm.training.strings;

public class StringDemo {

	public static void main(String[] args) {
		
		String s1 = "hello";
		String s2 = "hello";
		
		String s3 = new String("hello");
		
		System.out.println("s1 == s2 ? " + (s1 == s2));
		System.out.println("s1 == s3 ? " + (s1 == s3));
		
		String s4 = s1.concat(" world"); //s1 no change
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s4);
		
		System.out.println(System.currentTimeMillis());
	}

}
