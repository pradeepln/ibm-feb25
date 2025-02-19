package com.ibm.training.basics;

public class PrimitiveVsReference {

	public static void main(String[] args) {
		
		
		int answer = 42; //answer is a primitive
		
		increment(answer);
		
		System.out.println(answer);
		
		int[] nums = new int[10]; //nums is a reference
		nums[0] = 71;
		incrementArray(nums);
		System.out.println(nums[0]);

	}
	
	public static void increment(int x) {
		x++;
	}
	
	public static void incrementArray(int[] y) {
		y[0]++;
	}
	
	

}
