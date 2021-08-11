package day12_OOP;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Quiz02_TimerQuiz {

	private Date date;
	private SimpleDateFormat simpl;
	
	// �ܼ� setter/getter ������ �ƴ�
	public void setDate(){
		date = new Date();
		simpl =	new SimpleDateFormat("yyyy�� MM�� dd�� aa hh�� mm�� ss��");
	}
	
	public String getDate() {
		return simpl.format(date);
	}
	
}
