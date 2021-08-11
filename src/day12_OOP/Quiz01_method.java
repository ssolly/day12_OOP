package day12_OOP;

import java.io.IOException;
import java.util.Scanner;

public class Quiz01_method {

	public int input() {
		Scanner sc = new Scanner(System.in);
		int input;
		System.out.print("입력>>> ");
		input = sc.nextInt();
		return input;
	}
	
	public String useInput() {
		Scanner sc = new Scanner(System.in);
		String input;
		System.out.print("사용할 기능 입력>>> ");
		input = sc.next();
		return input;
	}
	
	public void clac() {
		System.out.println("calc.exe 동작 합니다");
		ProcessBuilder pro = new ProcessBuilder("calc");
		try {
			pro.start();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void notepad() {
		System.out.println("notepad.exe 동작 합니다");
		ProcessBuilder pro = new ProcessBuilder("notepad");
		try {
			pro.start();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}
