package com.deloitte.util;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class TimeUtilExample {

	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
		System.out.println(today);
		
		LocalDate previousWeeks = today.minusWeeks(2);
		System.out.println(previousWeeks);
		
		LocalDate nextMonths = today.plusMonths(3);
		System.out.println(nextMonths);
		
		LocalDate specificDate = LocalDate.of(2025, 12, 14);
		System.out.println(specificDate);
		
		LocalTime current = LocalTime.now();
		System.out.println(current);
		
		LocalTime pastHour = current.minusHours(5);
		System.out.println(pastHour);
		
		LocalTime specificTime = LocalTime.of(11, 30, 12);
		System.out.println(specificTime);
		
		LocalDateTime todayDateTime = LocalDateTime.now();
		System.out.println(todayDateTime);
		
		LocalDateTime previousDateTime = todayDateTime.minusYears(5);
		System.out.println(previousDateTime);
		
		LocalDateTime specificDateTime = LocalDateTime.of(2024, 11, 14, 11, 30);
		System.out.println(specificDateTime);
		
		DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy-MM-dd HH-mm-ss");
		String formatDateTime = todayDateTime.format(format);
		System.out.println(formatDateTime);
	}

}
