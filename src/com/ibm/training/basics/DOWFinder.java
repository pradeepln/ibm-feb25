package com.ibm.training.basics;

public class DOWFinder {
	
	public String findDOW(int day, int month, int year) {
		
		int numDays = 0;
		
		numDays = (year - 1900) * 365;
		numDays += (year - 1900) / 4;
		
		if(year % 4 == 0 && month <= 2) {
			numDays--;
		}
		
		switch(month) {
		case 12: numDays += 30;
		case 11: numDays += 31;
		case 10: numDays += 30;
		case 9: numDays += 31;
		case 8: numDays += 31;
		case 7: numDays += 30;
		case 6: numDays += 31;
		case 5: numDays += 30;
		case 4: numDays += 31;
		case 3: numDays += 28;
		case 2: numDays += 31;
		}
		
		numDays += day;
		
		int dowIndex = numDays % 7;
		
		String[] days = {"sunday","monday","tuesday","wednesday","thursday","friday","saturday"}; //new String[7];
		return days[dowIndex];
	}

	public static void main(String[] args) {
		DOWFinder obj = new DOWFinder();
		String dow = obj.findDOW(18,2,2025);
		System.out.println(dow);
	}

}
