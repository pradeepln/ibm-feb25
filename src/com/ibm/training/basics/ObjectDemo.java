package com.ibm.training.basics;

public class ObjectDemo {
	
	
	public static void addElement(Object anElement) {
		//logic
	}

	public static void main(String[] args) {
		String s = "hello";
		
		Car c = new Car();
		
		Point p = new Point(23, 14);
		
		addElement(s);
		addElement(c);
		addElement(p);

		
		Object o1 = new Truck(); 
		
		Truck t = (Truck) o1;
	}

}
