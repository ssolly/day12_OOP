package day12_OOP;

public class Ex02 {		//sleep

	public static void main(String[] args) {
		
		for(int i=0;i<5;i++) {
			System.out.println(i);
			try {
				Thread.sleep(500);	//1/1000����, ()�ð���ŭ ��� �����ش�
			} catch (Exception e) {
			}
		}
		System.out.println("���� ����� ����");
	}
}
