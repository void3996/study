package sec04.exam04.day79;
//Ŭ���� ���ο��� �޼ҵ� ȣ��
public class Calculator {
	int plus(int x, int y) {
		int result = x + y;
		return result;
	}
	
	double avg(int x, int y) {
		double sum = plus(x, y);	// 4���� plus �޼ҵ� ȣ��
		double result = sum / 2;
		return result;
	}
	
	void execute() {
		double result = avg(7, 10);	// 9���� avg �޼ҵ� ȣ��
		println("������: " + result);	//20���� println �޼ҵ� ȣ��
	}

	private void println(String message) {
		System.out.println(message);
	}
	/*
	 * //CalculatorExample ���������� Calculator 1. 16���ο��� ȣ���� ���� ���� �Ͼ�� avg() �޼ҵ尡
	 * ����ȴ�. 2. avg() �޼ҵ��� 10���ο��� ȣ���� �Ͼ�� plus() �޼ҵ尡 ����ȴ�. plus() �޼ҵ尡 ���ϰ��� �ָ�
	 * avg() �޼ҵ�� 10���ο��� ���ϰ��� sum ������ �����ϰ� 11������ ������ �� 12���ο��� execute() �޼ҵ�� ���ϰ���
	 * �ش�. 3. execute() �޼ҵ�� 16���ο��� avg() �޼ҵ��� ���ϰ��� �޾� 17���ο��� println() �޼ҵ带 ȣ���� ��
	 * �Ű� ������ �Ѱ��ش� ���������� execute() 18������ ������ �ǰ� ����ȴ�.
	 */
}
