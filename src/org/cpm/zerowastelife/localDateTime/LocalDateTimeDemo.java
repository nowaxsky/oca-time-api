package org.cpm.zerowastelife.localDateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class LocalDateTimeDemo {

	public static void main(String[] args) {
		//LocalDateTime.of(LocalDate, LocalTime)
		LocalDate flightDate = LocalDate.of(2017, Month.MAY, 2);
		LocalTime flightTime = LocalTime.of(21, 45);
		LocalDateTime flight = LocalDateTime.of(flightDate, flightTime);
		System.out.println("Flight leaves: " + flight);
		
		//LocalDateTime.of(int year, Month month, int dayOfMonth, int hour, int minute)
		LocalDateTime seminarStart = LocalDateTime.of(2017, Month.OCTOBER, 2, 9, 30);
		System.out.println("Seminar starts at: " + seminarStart);
		
		//plusDays(int day)
		//plusHours(int hour)
		LocalDateTime seminarEnd = seminarStart.plusDays(2).plusHours(8);
		System.out.println("Seminar ends at: " + seminarEnd);

	}

}
