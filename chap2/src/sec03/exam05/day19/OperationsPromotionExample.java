package sec03.exam05.day19;

public class OperationsPromotionExample {

	public static void main(String[] args) {
		byte byteValue1 = 10;	//byteValue1�� 10�� ����
		byte byteValue2 = 20;	//byteValue2�� 20�� ����
		
		//byte byteValue3 = byteValue1 + byteValue2; ���������� ��� int Ÿ���� �⺻���� �Ѵ�
		byte byteValue3 = (byte) (byteValue1 + byteValue2); //�׷��⿡ ��ȣ�� ���� ������ ���� byte�� ���� ����ȯ�Ͽ� byte �� �޴���
		int intValue1 = byteValue1 + byteValue2;	//�ƴϸ� ������� int �� �޾ƾ� ������ ������ �߻����� �ʴ´�.
		
		System.out.println(byteValue3);
		System.out.println(intValue1);
		
		char charValue1 = 'A';
		char charValue2 = 1;
		//char charValue3 = charValue1 + charValue2; //����������� ������ ��� char �� ���� ���Ѵ�
		char charValue3 = (char) (charValue1 + charValue2);
		int intValue2 = charValue1 + charValue2;	//char Ÿ���� 	��������� �� ��� int Ÿ������ ��ȯ	
		System.out.println("�����ڵ�=" + intValue2);
		System.out.println("��¹���=" + charValue3);
		System.out.println("��¹���=" + (char)intValue2);
		
		int intValue3 = 10;
		int intValue4 = intValue3/4;
		System.out.println(intValue4);
		
		int intValue5 = 10;
		//int intValue6 = 10 / 4.0;	double Ÿ������ �޾ƾ� ������ ������ �߻����� �ʴ´�.
		double doubleValue = intValue5 / 4.0;
		System.out.println(doubleValue);
		
		int x = 1;
		int y = 2;
		double result = (double) x / y;	//�Ǽ��� ����� �� �ִ�
		System.out.println(result);
	}

}
