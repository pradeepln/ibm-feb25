package com.ibm.training.basics;
class Base{
	public Base(int some) {
		System.out.println(" In Base constr");
	}
}

class Child extends Base{
	public Child() {
		super(2);
		System.out.println(" In Child constr");
	}
}


public class ConstructorChainingDemo {

	public static void main(String[] args) {
		Child c = new Child();

	}

}
