package sec02.exam08.day34;

public class CompareOperatorExample2 {

	public static void main(String[] args) {
		int v2 = 1;
		double v3 = 1.0;
		System.out.println(v2 == v3); 	//true
		
		double v4 = 0.1;
		float v5 = 0.1f;
		//�Ǽ��� �������� �ε� �Ҽ��� ����� 0.1�� ��Ȯ�ϰ� ǥ���� �� ����
		//0.1f�� 0.1�� �ٻ簪�̴�.
		System.out.println(v4 == v5); 	//false
		System.out.println((float)v4 == v5); 	//true
		//�ǿ����ڸ� float Ÿ������ ��ȯ�ؼ� ���ϸ� true�� ����� ����� �� �ִ�.
	}
}
