package day12_OOP;

import java.util.HashMap;

public class Quiz01_Win7_Main {

	public static void main(String[] args) {
		
		Quiz01_method qm = new Quiz01_method();
		
		while(true) {
			System.out.println("===== ȯ���մϴ� =====");
			System.out.println("1. ���");
			System.out.println("2. off");
			int choice = qm.input();
			
			switch(choice) {
			case 1 :
				System.out.println("��� ���� ���");
				System.out.println("1 : ����");
				System.out.println("2 : �޸���");
				String str = qm.useInput();
				if (str.equals("����")) {
					qm.clac();
				} else if (str.equals("�޸���")) {
					qm.notepad();
				} else {
					System.out.println("�߸��� �Է��Դϴ�");
				}
				break;
				
			case 2:
				System.out.println("����");
				return;
			}
			
		}

	}
}
