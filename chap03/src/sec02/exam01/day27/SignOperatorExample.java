package sec02.exam01.day27;

public class SignOperatorExample {

	public static void main(String[] args) {
		
		int x = -100;
		int result1 = +x;	//+ �� �ǿ������� ��ȣ ����
		int result2 = -x;	//- �� �ǿ������� ��ȣ ����
		System.out.println("result1=" + result1);
		System.out.println("result2=" + result2);
		
		byte b = 100;
		//byte result3 = -b; byte Ÿ�� ���� ��ȣ �����ϸ� int Ÿ�� ������ �ٲ�Ƿ� ������ ���� �߻�
		int result3 = -b;
		System.out.println("result3=" + result3);	
	}
}
