package sec02.exam05.day31;

public class CharOperationExample {

	public static void main(String[] args) {
		
		char c1 = 'A' + 1;	//char c1 = 66; ���� �����ϵȴ� ���ͷ� ���� ������
							//������ �ܰ迡�� �����ϱ� ������ Ÿ�� ��ȯ�� ����.
		char c2 = 'A';
		//char c3 = c2 + 1;	//char ������ ��� ���꿡 ���Ǹ� int Ÿ������ ��ȯ�ǹǷ� �������� int Ÿ���̵ȴ�.
		char c3 = (char) (c2 + 1);	//���� Ÿ�� ��ȯ���� ������ ���� ���� ����� ������ �ִ�.
		System.out.println("c1: " + c1);
		System.out.println("c2: " + c2);
		System.out.println("c3: " + c3);
	}

}
