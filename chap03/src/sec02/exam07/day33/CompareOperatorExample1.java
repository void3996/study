package sec02.exam07.day33;

public class CompareOperatorExample1 {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 10;
		boolean result1 = (num1 == num2);	// ==�� ���� ������ ���Ѵ�
		boolean result2 = (num1 != num2);	// !=�� ���� �ٸ��� �˻��Ѵ�
		boolean result3 = (num1 <= num2);	// <=�� ������ �ǿ����ڰ� �۰ų� �������� �˻��Ѵ�.
		System.out.println("result1=" + result1);
		System.out.println("result2=" + result2);
		System.out.println("result3=" + result3);
		
		char char1 = 'A';
		char char2 = 'B';
		boolean result4 = (char1 < char2);	
		//�ǿ����ڰ� charŸ���̸� �����ڵ� ������ �� ������ �����Ѵ�
		System.out.println("result4=" + result4);
	}

}
