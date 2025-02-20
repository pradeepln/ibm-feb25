package com.ibm.training.dates;

import java.time.LocalDate;

public class DateDemo {

	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
		
		System.out.println(today);
		
		System.out.println(today.lengthOfMonth());
		
		LocalDate dateAfter3Days = today.plusDays(3);
		
		System.out.println("day on 3 days from now: " + dateAfter3Days.getDayOfWeek());
	}

}
