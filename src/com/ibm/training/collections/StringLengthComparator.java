package com.ibm.training.collections;

import java.util.Comparator;

public class StringLengthComparator implements Comparator<String> {

	@Override
	public int compare(String s1, String s2) {
		/*
		 * if(s1.length() > s2.length()) { return 1; }else if(s2.length() > s1.length())
		 * { return -1; }else { return 0; }
		 */
		//System.out.println(s1 +" comparing to "+s2);
		return s1.length() - s2.length();
	}

}
