package sec02.exam08.day53;

public class BreakExample {

	public static void main(String[] args) {
		while (true) {
			int num = (int) (Math.random() * 6 + 1);	
			System.out.println(num);
			if (num == 6) {	//num �� 6 �� ���ٸ� break ����
			break;
			
			}
		}
		System.out.println("���α׷� ����");
	}
}
