package sec02.exam11.day37;

public class ConditionalOperationExample {

	public static void main(String[] args) {
		int score = 85;
		//���׿����� 	(���ǽ�, �ǿ�����1) ? '�ǿ�����2' : (�ǿ�����3(���ǽ�, �ǿ�����1) ? '�ǿ�����2' : '�ǿ�����3')
		char grade = (score > 90) ? 'A' : ((score > 80) ? 'B' : 'C');
		// score�� 90���� ũ�� true�̸� ����� 'A'�̴� false�̸� ���� ���� score�� 80���� ũ�� 'B'�̴�. false�� ����� 'C'�̴�.
		//char grade;
//		if(score > 90) {
//			grade = 'A';
//		}else if (score > 80) {
//			grade = 'B';
//		}else {
//			grade = 'C';
//		}
		
		System.out.println(score + "���� " + grade +"����Դϴ�.");
		
		

	}

}
