package sec04.exam02.day23;

public class KeyCodeExample {

	public static void main(String[] args) throws Exception{
			//���� Ű�ڵ带 ������ ����
		//int keyCode = System.in.read();
					//�ý����� ������ �ִ�.�Է���ġ����.�Էµ� Ű�ڵ带 �о��
		int keyCode;
		
		keyCode = System.in.read();	//a�� �Է��ϰ� ����Ű�� ġ��
		System.out.println("keyCode: " + keyCode);	// a ������ Ű�ڵ� 97 ��µȴ�.
		
		keyCode = System.in.read();
		System.out.println("keyCode: " + keyCode);	//�״��� ���Ϳ� ���� Ű�ڵ� 13�� ��µȴ�
		//����Ű�� �ٸ�Ű�� �ٸ��� CR(ĳ��������)�� LF(���� �ǵ�) �� ������ Ű�ڵ尡 �Էµȴ�
		
		keyCode = System.in.read();
		System.out.println("keyCode: " + keyCode);	//�׷��� LF�� �ش��ϴ� Ű�ڵ� 10�� ��µȴ�
	}

}
