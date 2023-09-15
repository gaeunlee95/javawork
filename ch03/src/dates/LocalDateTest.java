package dates;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class LocalDateTest {

	public static void main(String[] args) {
		// LocalDateTime 클래스 사용
		LocalDateTime t = LocalDateTime.now();
		System.out.println(t);
		
		//날짜 / 시간 포맷 수정 - "yyyy/MM/dd HH:mm:ss a"
		DateTimeFormatter dtFormat = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss a");
		System.out.println(t.format(dtFormat));
		
		//날짜 설정
		LocalDate date = LocalDate.now();
		System.out.println(date);
	
		LocalTime time = LocalTime.now();
		System.out.println(time);
		
		//날짜 / 시간 포맷 수정 - "yyyy/MM/dd HH:mm:ss a"
		DateTimeFormatter timeFormat = DateTimeFormatter.ofPattern("HH:mm:ss a");
		System.out.println(time.format(timeFormat));

		//특정 날짜 지정하기
		LocalDate startDay = LocalDate.of(2023, 8, 1);
		LocalDate today = LocalDate.of(2023, 9, 15);
		
		//지나온 날짜 계산하기
		long passedTime = ChronoUnit.DAYS.between(startDay, today);
		System.out.println(passedTime + "일이 지났습니다.");
	
	}

}
