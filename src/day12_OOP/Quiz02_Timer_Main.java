package day12_OOP;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Quiz02_Timer_Main {

	public static void main(String[] args) {
		
		
		Quiz02_TimerQuiz tq = new Quiz02_TimerQuiz();
		
		tq.setDate();
		System.out.println(tq.getDate());
		
		for(int i=0;i<5;i++) {
			tq.setDate();
			System.out.println(tq.getDate());
			try {
				Thread.sleep(1000);	//1/1000����, ()�ð���ŭ ��� �����ش�
			} catch (Exception e) {
			}
		}
	
	}
}
