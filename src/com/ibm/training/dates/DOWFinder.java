package com.ibm.training.dates;

import java.time.LocalDate;

public class DOWFinder {
	
	public String findDOW(int day, int month, int year) {
		LocalDate thatDay = LocalDate.of(year, month, day);
		return thatDay.getDayOfWeek().name();
	}

	public static void main(String[] args) {
		DOWFinder obj = new DOWFinder();
		String dow = obj.findDOW(18,2,2025);
		System.out.println(dow);
	}

}
