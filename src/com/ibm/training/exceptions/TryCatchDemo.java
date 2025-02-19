package com.ibm.training.exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class TryCatchDemo {

	public static void main(String[] args) {
		
		try {
			int size = Integer.parseInt(args[0]);
			String[] words = new String[size];
			System.out.println("Allocated array of size "+size);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Please pass array size as cmd line arg");
		}catch(NumberFormatException e) {
			System.out.println("You passed a cmd line arg, alright. But, it's not a number!");
			//e.printStackTrace();
		}
		
		try {
			String data = readDataFromFile("abc.txt");
		}catch (FileNotFoundException e) {
			// TODO: handle exception
		}
	}

	
	
	
	private static String readDataFromFile(String fileName) throws FileNotFoundException {
		String data = null;
		
		FileReader fr = new FileReader(fileName);
		
		
		return data;
	}

}
