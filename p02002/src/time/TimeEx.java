package time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class TimeEx {
	public static void main(String[] args) {
		LocalDate date = LocalDate.now();
		LocalTime date4 = LocalTime.now();
		LocalDateTime date2 = LocalDateTime.of(date, date4); 
		ZonedDateTime date3 = ZonedDateTime.of(date2, ZoneId.of("Asia/Seoul"));
		System.out.println(date4);
		System.out.println(date);
		System.out.println(date2);
		System.out.println(date3);
	}
}
