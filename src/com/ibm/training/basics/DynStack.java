package com.ibm.training.basics;

public class DynStack implements Stack{

	//LinkedList etc
	@Override
	public void push(Object anElement) {
		System.out.println("pushed into dyn stack");
		
	}

	@Override
	public Object pop() {
		System.out.println("popped from dyn stack");
		return null;
	}

}
