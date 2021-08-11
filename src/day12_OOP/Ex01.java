package day12_OOP;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Ex01 { // ��¥,�ð� ǥ���ϱ�

	public static void main(String[] args) {
		
		//�ʴ���
		// Unix Time : 1970�� 1�� 1�� ���ķ� �ð��� �� �� �귶������ ���� �ð��� ��Ÿ���� �ð�
		long time = System.currentTimeMillis();
		System.out.println("timeMillis : " + time);
		
		//������ : ������ ���� (yyyy��, MM��, dd��, aa��������, hh��, mm��, ss��)
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		String date = df.format(time);
		System.out.println(date);
		
		Date d = new Date();	//������Ʈ ����� Ŭ����
		System.out.println("original Date : " + d);
		System.out.println("format   Date : " + df.format(d));
		
		Calendar cal = Calendar.getInstance();
		System.out.println("cal : " + cal);
		System.out.println("�⵵ : " + cal.get(Calendar.YEAR));
		System.out.println("��  : " + cal.get(Calendar.MONTH)+1);
		System.out.println("��  : " + cal.get(Calendar.DATE));
	}
}
