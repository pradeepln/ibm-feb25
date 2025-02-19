package com.ibm.training.basics;

import static java.lang.Math.*;

public class StaticImportDemo {

	public static void main(String[] args) {
		// We want to do lot math ops
		
		double radius = 123D;
		
		/*
		 * double answer = Math.PI * radius * radius;
		 * 
		 * double sinRadius = Math.sin(radius);
		 * 
		 * double tanR = Math.tan(radius);
		 */
		
		
		double answer = PI * radius * radius;
		
		double sinRadius = sin(radius);
		
		double tanR = tan(radius);
		

	}

}
