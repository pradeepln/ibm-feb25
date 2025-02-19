package com.ibm.training.basics;

public class PrimitiveTypesDemo {

	public static void main(String[] args) {
		
		byte aByte = 127;
		
		short aShort = 32767;
		
		int anInt = 2_147_483_647;
		
		aShort++;
		aShort++;
		
		System.out.println(aShort);
		
		short another = -32768;
		
		another--;
		
		System.out.println(another);

	}

}
