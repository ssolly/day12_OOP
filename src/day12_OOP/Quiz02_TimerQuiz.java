package day12_OOP;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Quiz02_TimerQuiz {

	private Date date;
	private SimpleDateFormat simpl;
	
	// 단순 setter/getter 생성이 아님
	public void setDate(){
		date = new Date();
		simpl =	new SimpleDateFormat("yyyy년 MM월 dd일 aa hh시 mm분 ss초");
	}
	
	public String getDate() {
		return simpl.format(date);
	}
	
}
