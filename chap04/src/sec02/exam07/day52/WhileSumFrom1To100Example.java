package sec02.exam07.day52;

public class WhileSumFrom1To100Example {

	public static void main(String[] args) {
		int sum = 0;	//sum �� �հ踦 ������ ����
		
		int i = 1;	// i �� ���� ī���� ����
		//while�� ���ο��� ��� �����Ǵ� ���� ���� ���� ī���� ������ while �� �����ϱ� ���� �̸� �����ؾ��Ѵ�
		
		while (i<=100) {
			sum += i;
			i++;
		}
		System.out.println("1~" + (i-1) + " �� : " + sum);
		//1~100���� ��
	}

}
