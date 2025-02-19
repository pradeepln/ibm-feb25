package com.ibm.training.exceptions;

import com.ibm.training.basics.Car;
import com.ibm.training.basics.Truck;
import com.ibm.training.basics.Vehicle;

public class CommonExceptionsDemo {
	
	

	public static void main(String[] args) {
		
		//arrayException();
		
//		Car c = getDataFromDB();
//		npe(c);
		
//		Car c = new Car();
//		cce(c);
		
		boom();

	}

	private static void boom() {
		
		long[] huuugeArray = new long[Integer.MAX_VALUE];
		
	}

	private static void cce(Vehicle v) {
		
		Truck t = (Truck) v;
	}

	private static Car getDataFromDB() {
		
		return null;
	}

	private static void npe(Car c) {
		c.start();
		
	}

	private static void arrayException() {
		int[] nums = new int[10];
		
		nums[0] = 20;
		
		
		nums[10] = 11;
		
	}

}
