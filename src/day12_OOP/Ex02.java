package day12_OOP;

public class Ex02 {		//sleep

	public static void main(String[] args) {
		
		for(int i=0;i<5;i++) {
			System.out.println(i);
			try {
				Thread.sleep(500);	//1/1000기준, ()시간만큼 대기 시켜준다
			} catch (Exception e) {
			}
		}
		System.out.println("다음 문장들 실행");
	}
}
