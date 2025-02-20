package com.ibm.training.dates;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class AgeCalculator {

	public static void main(String[] args) {
		
		System.out.println("Enter your birthday (yyyy-MM-dd): ");
		Scanner kb = new Scanner(System.in);
		String birthDayStr = kb.nextLine();
		
		LocalDate birthday = LocalDate.parse(birthDayStr);
		System.out.println("You were bonrn on a "+birthday.getDayOfWeek()+" , it was "+ birthday.getDayOfYear() +" day of the year");
		
		LocalDate today = LocalDate.now();
		Period p = Period.between(birthday, today);
		
		System.out.println("You are "+p.getYears()+" years, "+p.getMonths()+" months and "+p.getDays()+" days old!");
		
	}

}
