package sec02.exam03.day29;

public class DenyLogicOperatorExample {

	public static void main(String[] args) {
		// !�� �� ���� ������
		boolean play = true;	
		
		System.out.println(play);	//play�� true�̴�
		
		play = !play;	//play�� ����
		System.out.println(play);	//true�� �����Ͽ����Ƿ� play�� false�̴�.
		
		play = !play;	//������ play�� ����
		System.out.println(play);	//false�� play�� �����Ͽ����� play�� true�̴�.

	}

}
