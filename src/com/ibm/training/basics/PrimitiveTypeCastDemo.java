package com.ibm.training.basics;

public class PrimitiveTypeCastDemo {

	public static void main(String[] args) {
		int i = 10;
		
		long l = 2147483647L;

		
		long l2 = i; //implicit type casting
		
		System.out.println(l2);
		
		int j = (int) l; //explicit type casting
		
		System.out.println(j);
	}

}
