package com.ibm.training.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ListDemo {

	public static void main(String[] args) {
		//arrayListDemo();
		//linkedListDemo();
		
	}
	
	public static void someAlgo(List<String> list) {
		list.add("abc");
		
		//stuff
		list.add(0, "first");
		
		
		//stuff
		String third = list.get(2);
	}

	private static void linkedListDemo() {
		LinkedList<String> names = new LinkedList<>();
		names.add("alibaba");
		names.add("Jack Pa");
		names.add(1, "founder");
		System.out.println(names);
		
		names.addFirst("chinese");
		names.addLast("end");
		System.out.println(names);
		
		someAlgo(names);
	}

	private static void arrayListDemo() {
		
		List<String> nameList = new ArrayList<>();
		
		Scanner kb = new Scanner(System.in);
		
		while(true) {
			System.out.println("Enter a Student's name: ");
			String aName = kb.nextLine();
			if(aName.equals("quit")) {
				break;
			}
			nameList.add(aName);
		}
		System.out.println("Totally there are "+nameList.size()+" students");
		System.out.println(nameList);
		System.out.println("At index 3 = "+nameList.get(3));
		
		someAlgo(nameList);
	}

}
