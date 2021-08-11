package day12_OOP;

import java.util.HashMap;

public class Quiz01_Win7_Main {

	public static void main(String[] args) {
		
		Quiz01_method qm = new Quiz01_method();
		
		while(true) {
			System.out.println("===== 환영합니다 =====");
			System.out.println("1. 기능");
			System.out.println("2. off");
			int choice = qm.input();
			
			switch(choice) {
			case 1 :
				System.out.println("사용 가능 기능");
				System.out.println("1 : 계산기");
				System.out.println("2 : 메모장");
				String str = qm.useInput();
				if (str.equals("계산기")) {
					qm.clac();
				} else if (str.equals("메모장")) {
					qm.notepad();
				} else {
					System.out.println("잘못된 입력입니다");
				}
				break;
				
			case 2:
				System.out.println("종료");
				return;
			}
			
		}

	}
}
