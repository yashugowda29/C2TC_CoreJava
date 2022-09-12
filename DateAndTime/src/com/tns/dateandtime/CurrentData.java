package com.tns.dateandtime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class CurrentData {

	public static void main(String[] args) {
		
		LocalDate date = LocalDate.now(); // Current Date
		LocalTime time = LocalTime.now(); // Current Time
		
		LocalDateTime datetime = LocalDateTime.now(); // Current Date and Time
		
		System.out.println("Current date is : " + date); //YYYY-MM-DD
		System.out.println("Current time is : " + time); //HH-MM-SS.ZZZZ
		System.out.println("Current datetime is : " + datetime);
		
		DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("E,dd-MMMM-yyyy HH:mm:ss");
		String formattedDate = datetime.format(myFormatObj);
		System.out.println("Formatted Date is : " + formattedDate);
	}

}
