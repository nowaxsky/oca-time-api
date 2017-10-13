package org.cpm.zerowastelife.compare;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class CompareDemo {

	public static void main(String[] args) {
		System.out.println("-----Old Method-----");
		oldWay();
		System.out.println("\n-----New Method in Java 8-----");
		newWay();
	}
	
	private static void oldWay() {
		Date nowDate = new Date();
		System.out.println(nowDate);
		
		//same with above
		Date nowDateTime = new Date();
		System.out.println(nowDateTime);
		
		//not fluent
		Calendar c = Calendar.getInstance();
		c.set(2017, Calendar.JANUARY, 1);
		c.add(Calendar.DATE, 1);
		c.add(Calendar.DATE, -1);
		Date jan = c.getTime();
		System.out.println(jan);
		
		SimpleDateFormat sf = new SimpleDateFormat("hh:mm");
		System.out.println(sf.format(nowDate));
		System.out.println(sf.format(nowDateTime));
	}
	
	private static void newWay() {
		LocalDate nowDate = LocalDate.now();
		System.out.println(nowDate);
		
		LocalTime nowDateTime = LocalTime.now();
		System.out.println(nowDateTime);
		
		//fluent
		LocalDate jan = LocalDate.of(2017, Month.JANUARY, 1).plusDays(5).minusDays(1);
		System.out.println(jan);
		
		DateTimeFormatter sf = DateTimeFormatter.ofPattern("hh:mm");
		//System.out.println(sf.format(nowDate));
		//Exception in thread "main" java.time.temporal.UnsupportedTemporalTypeException
		System.out.println(sf.format(nowDateTime));
	}

}
