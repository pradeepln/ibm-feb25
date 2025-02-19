package com.ibm.training.basics;

public class ChemicalApp {

	public static void main(String[] args) {
		ChemicalElement h = new ChemicalElement(1, "H", "Hydrogen");
		ChemicalElement k = new ChemicalElement(19, "K", "Potassium");
		ChemicalElement o = new ChemicalElement(8, "O", "Oxygen");
		ChemicalElement ga = new ChemicalElement(31, "Ga", "Gallium");
		
		//immutable
		printDetails(h);
		printDetails(k);
		printDetails(o);
		printDetails(ga);
	}
	
	public static void printDetails(ChemicalElement c) {
		System.out.println("_________________"+ c.getName() +"_________________");
		System.out.println("Is it a metal? " + c.isMetal());
		System.out.println("Is it a trasition metal? " + c.isTransitionMetal());
		System.out.println("Is it an alkali metal? " + c.isAlkaliMetal());
		
		//c.atomicNumber = -1;
		//c.setAtomicNumber(-1);
	}

}
