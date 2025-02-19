package com.ibm.training.basics;

public class Point {
	
	
	int x,y;
	
	public Point(int x,int y) {
		this.x = x;
		this.y = y;
		System.out.println("Constr called!!!!");
	}

	//not fully right
	public boolean equals(Point other) {
		return (x == other.x && y == other.y);
	}
}
