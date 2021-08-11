package day12_OOP;

import java.io.IOException;
import java.util.Scanner;

public class Ex03 {		//process builder

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("윈도우 실행 명령어 입력 : ");
		String str = sc.next();
		
		ProcessBuilder pro = new ProcessBuilder(str);
		try {
			pro.start();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
