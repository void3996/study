package sec01.exam03.day5;

public class VariableExchangeExample {

	public static void main(String[] args) {
		int x = 3;	//���� x�� 3�� ��Ҵ�
		int y = 5;	//���� y�� 5�� ��Ҵ�
		System.out.println("x: " + x + ", y: " + y);	//���� x�� y�� ���� ���

		int temp = x;	//���� temp�� ���� x(3)�� ��Ҵ�.
		
		x = y;	//���� x�� ���� y(5)�� ��Ҵ�.
		y = temp;	//���� y��  ���� temp(3)�� ��Ҵ�.
		System.out.println("x: " + x + ", y: " + y);	//���� x�� y�� ���� ���
	}

}
