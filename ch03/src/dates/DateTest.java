package dates;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest {

	public static void main(String[] args) {
		// Date 객체
		Date date = new Date();
		System.out.println(date);
		
		//날짜/시간 포맷 - "yyyy/MM/dd hh:mm:ss a(오전/오후)"
		SimpleDateFormat now = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss a"); //MM 월, hh 12시, HH 24시
		System.out.println(now.format(date));
		
		
		
		

	}

}
