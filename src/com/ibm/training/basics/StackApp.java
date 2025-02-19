package com.ibm.training.basics;

public class StackApp {

	public static void main(String[] args) {
		StackUser u = new StackUser();
		
		FixedArrayStack s = new FixedArrayStack(10);
		//DynStack s = new DynStack();
		u.fill(s);
		
		System.out.println(s.top);

	}

}
