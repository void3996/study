package sec03.exam02.day16;

public class CastingExample {

	public static void main(String[] args) {
		int intValue = 44032;
		char charValue = (char) intValue;	//char Ÿ������ ���� Ÿ�Ժ�ȯ �����ڵ� 10�� �� 44032�� '��' �̴�
		System.out.println(charValue);
		
		long longValue = 500;
		intValue = (int) longValue;	// intŸ������ ���� Ÿ�Ժ�ȯ int Ÿ�� ǥ�� �������̱⿡ �״�� ǥ��ȴ�.
		System.out.println(intValue);
		
		double doubleValue = 3.14;
		intValue = (int) doubleValue;	//int Ÿ������ ���� Ÿ�Ժ�ȯ�Ǿ� �Ҽ��� ���Ϻκ� �������� �����κи� ����
		System.out.println(intValue);

	}

}
