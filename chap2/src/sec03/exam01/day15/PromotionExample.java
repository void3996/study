package sec03.exam01.day15;

public class PromotionExample {

	public static void main(String[] args) {
		// �ڵ� Ÿ�� ��ȯ�� ���� ��� ������ ���� Ÿ���� �������� ū Ÿ������ ����ɶ� �߻��Ѵ�.
		//byte < short < int < long < float < double
		byte byteValue = 10;
		int intValue = byteValue;	//int Ÿ���� byte Ÿ�Ժ��� �������� �� ũ�� ������ �ڵ� Ÿ�� ��ȯ �ȴ�.
		System.out.println("intValue: " + intValue);
		
		char charValue = '��';
		intValue = charValue;	//char Ÿ���� ��� int Ÿ������ �ڵ� Ÿ�� ��ȯ �Ǹ� �����ڵ� ���� int Ÿ�Կ� ����ȴ�.
		System.out.println("���� �����ڵ�: " + intValue);
		
		intValue = 50;
		long longValue = intValue;	//long Ÿ���� int Ÿ�Ժ��� �������� �� ũ�� ������ �ڵ� Ÿ�� ��ȯ �õ�.
		System.out.println("longValue: " + longValue);
		
		longValue = 100;
		float floatValue = longValue;
		System.out.println("floatValue: " + floatValue);
		
		floatValue = 100.5F;
		double doubleValue = floatValue;
		System.out.println("doubleValue: " + doubleValue);
	}

}
