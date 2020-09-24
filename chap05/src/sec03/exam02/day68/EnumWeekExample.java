package sec03.exam02.day68;

import java.util.Calendar;

import sec03.exam01.day67.Week;

public class EnumWeekExample {

	public static void main(String[] args) {
		Week today = null;	//���� Ÿ�� ���� ����
		
		Calendar cal = Calendar.getInstance();
		int week = cal.get(Calendar.DAY_OF_WEEK);	//�Ͽ���(1)~�����(7)������ ���ڸ� ����
		
		switch (week) {
		case 1:
		 	today = Week.SUNDAY;	//���� ��� ����
			break;
		case 2:
			today = Week.MONDAY;
			break;
		case 3:
			today = Week.TUESDAY;
			break;
		case 4:
			today = Week.WEDNESDAY;
			break;
		case 5:
			today = Week.THURSDAY;
			break;
		case 6:
			today = Week.FRIDAY;
			break;
		case 7:
			today = Week.SATURDAY;
			break;
		}
		System.out.println("���� ����: " + today);
		
		if (today == Week.SUNDAY) {
			System.out.println("�Ͽ��Ͽ��� �౸�� �մϴ�.");
		}else {
			System.out.println("������ �ڹ� ���� �մϴ�.");
		}
	}

}
