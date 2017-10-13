package org.cpm.zerowastelife.period;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class PeriodDemo {

	public static void main(String[] args) {
		LocalDate christmas = LocalDate.of(2017, 12, 25);
		LocalDate today = LocalDate.now();
		System.out.println("Today is: " + today);
		
		//ChronoUnit can calculate the specific time unit and return long
		long days = ChronoUnit.DAYS.between(today, christmas);
		System.out.println("There are " + days + " days until Xmas");
		
		//Period can get time format like ...years...months...days
		Period untilXmas = Period.between(today, christmas);
		System.out.println("There are " + untilXmas.getMonths() + " months, " + untilXmas.getDays() + " days until Xmas");

		//Bad method cannot be reusable
		LocalDate badMethod = LocalDate.now();
		plusDay(badMethod);
		System.out.println("Bad method cannot be reusable: " + badMethod);
		
		//Good method is reusable
		LocalDate goodMethod = LocalDate.now();
		plusDayByPeriod(goodMethod, Period.ofYears(1));
		plusDayByPeriod(goodMethod, Period.ofMonths(1));
		plusDayByPeriod(goodMethod, Period.ofWeeks(1));
		plusDayByPeriod(goodMethod, Period.ofDays(1));
		System.out.println("Good method is reusable: " + goodMethod);
		
		//BE CAREFUL! ofYears, ofMonths and so on are static method, so it just works at final method
		//p1 is same with Period.ofWeeks(1)
		Period p1 = Period.ofMonths(1).ofWeeks(1);
		System.out.println("Today + p1 = " + LocalDate.now().plus(p1));
		
		Period p2 = Period.ofMonths(1);
		p2 = Period.ofWeeks(1);
		System.out.println("Today + p2 = " + LocalDate.now().plus(p2));
	}
	
	private static void plusDay(LocalDate localDate) {
		localDate = localDate.plusYears(1).plusMonths(1).plusWeeks(1).plusDays(1);
	}
	
	private static void plusDayByPeriod(LocalDate localDate, Period period) {
		localDate = localDate.plus(period);
	}

}
