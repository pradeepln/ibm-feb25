package com.ibm.training.basics;


public class IdentityVsEquality {

	public static void main(String[] args) {

		Point p1 = new Point(10, 20);
		
		Point p2 = new Point(10, 20);
		
//		Point p1 = new Point();
//		p1.x = 10;
//		p1.y = 20;
//		
//		Point p2 = new Point();
//		p2.x = 10;
//		p2.y = 20;
		
		Point p3 = p1;
		
		System.out.println("are the x values of p1 and p2 'equal'? " + (p1.x == p2.x));
		System.out.println("are p1 and p2 'identical' ? " + (p1 == p2));
		System.out.println("are p1 and p3 'identical' ? " + (p1 == p3));
		
		System.out.println("are p1 and p2 'equal' ? " + (p1.equals(p2)));
	}

}
