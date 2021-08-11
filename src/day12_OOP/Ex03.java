package day12_OOP;

import java.io.IOException;
import java.util.Scanner;

public class Ex03 {		//process builder

	// process : �������� ��
	// process builder : �������� �͵��� �غ�����ְڴ� = ����Ŵ
	//					 �ش��ϴ� �ü���� ����, cmd�� ����� ����
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("������ ���� ��ɾ� �Է� : ");
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
