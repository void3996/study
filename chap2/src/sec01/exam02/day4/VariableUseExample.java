package sec01.exam02.day4;

public class VariableUseExample {

	public static void main(String[] args) {
		
		int hour = 3;	//���� hour�� 3�� ��Ҵ�
		int minute = 5;	//���� minute�� 5�� ��Ҵ�								
		System.out.println(hour + "�ð�" + minute + "��");	//���� hour�� minute�� ���� ���
		
		int totalMinute = (hour * 60) + minute;	//���� hour�� 60�� ���� ���� ����  minute�� ���Ͽ� ���� totalMinute�� ��Ҵ�
		System.out.println("��" + totalMinute + "��");	//���� totalMinute�� ���
	}

}
