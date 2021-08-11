package day12_OOP;

import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		HashMap map = new HashMap();
		map.put("�޸���", "notepad");
		map.put("����", "calc");
		map.put("�׸���", "mspaint");
		
		System.out.println(map);
		
		System.out.print("������ ���� ��ɾ� �Է� : ");
		String key = sc.next();
		if (map.containsKey(key)) {
			ProcessBuilder pro = new ProcessBuilder( (String)map.get(key) );
			try {
				pro.start();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
		} else {
			System.out.println("�ش� ��ɾ�� �������� �ʽ��ϴ�.");
		}
	}
}
