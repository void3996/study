package sec02.exam02.day47;

public class ForSumFrom1To100Example1 {

	public static void main(String[] args) {
		int sum = 0;
			//���� i �� 0 �� ��Ҵ�; i �� 100���� ���ų� ������ true �ƴϸ� false; ���� �ش� ������ �����ϰ� ���� i�� ���� 1 ������Ŵ
		for (int i = 0; i <= 100; i++) {
			sum += i;
		}
		System.out.println("1~100 �� : " + sum);
	}

}
