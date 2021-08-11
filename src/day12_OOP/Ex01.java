package day12_OOP;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Ex01 { // 날짜,시간 표현하기

	public static void main(String[] args) {
		
		//초단위
		// Unix Time : 1970년 1월 1일 이후로 시간이 몇 초 흘렀는지로 현재 시간을 나타내는 시간
		long time = System.currentTimeMillis();
		System.out.println("timeMillis : " + time);
		
		//포맷팅 : 형식을 변경 (yyyy년, MM월, dd일, aa오전오후, hh시, mm분, ss초)
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		String date = df.format(time);
		System.out.println(date);
		
		Date d = new Date();	//업데이트 종료된 클래스
		System.out.println("original Date : " + d);
		System.out.println("format   Date : " + df.format(d));
		
		Calendar cal = Calendar.getInstance();
		System.out.println("cal : " + cal);
		System.out.println("년도 : " + cal.get(Calendar.YEAR));
		System.out.println("월  : " + cal.get(Calendar.MONTH)+1);
		System.out.println("일  : " + cal.get(Calendar.DATE));
	}
}
