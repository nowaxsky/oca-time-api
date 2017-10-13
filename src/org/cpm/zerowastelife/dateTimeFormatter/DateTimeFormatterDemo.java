package org.cpm.zerowastelife.dateTimeFormatter;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class DateTimeFormatterDemo {

	public static void main(String[] args) {
		LocalDateTime now = LocalDateTime.now();
		DateTimeFormatter f = null;
		
		//yyyy-MM-dd
		f = DateTimeFormatter.ISO_LOCAL_DATE;
		System.out.println("ISO_LOCAL_DATE format: " + now.format(f));
		
		//yyyy-ddd(days of year)
		f = DateTimeFormatter.ISO_ORDINAL_DATE;
		System.out.println("ISO_ORDINAL_DATE format: " + now.format(f));

		//yyyy-MM-ddTHH:mm:ss.s
		f = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
		System.out.println("ISO_LOCAL_DATE_TIME format: " + now.format(f));
		
		//4 characters is for complete format instead of abbreviation
		f = DateTimeFormatter.ofPattern("EEEE, MMMM dd, yyyy G, hh:mm a");
		System.out.println("Complete format: " + now.format(f));
		
		//customized format
		f = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.n");
		System.out.println("Customized format A: " + now.format(f));
		
		f = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.s");
		System.out.println("Customized format B: " + now.format(f));
		
		//localized date time
		f = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG);
		System.out.println("Localized date time format: " + now.format(f));
		
		DateTimeFormatter dFormat = DateTimeFormatter.ofPattern("MM dd yyyy");
		LocalDate date = LocalDate.parse("01 02 2017", dFormat);
		System.out.println("Read customized date format: " + date);
		
		DateTimeFormatter tFormat = DateTimeFormatter.ofPattern("HH mm ss");
		LocalTime time = LocalTime.parse("11 22 57", tFormat);
		System.out.println("Read customized time format: " + time);
	}

}
