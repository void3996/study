package sec02.exam09.day54;

public class BreakOutterExample {

	public static void main(String[] args) {
		Label: for (char upper = 'A'; upper <= 'Z'; upper++) {
			for (char lower = 'a'; lower <= 'z'; lower++) {
				System.out.println(upper + "-" + lower);
				if (lower=='g') {
					break Label;	//�ݺ��� ��ø�Ǿ� ���� ��� break ���� ���� ����� �ݺ����� �����ϰ�
									//�ٱ��� �ݺ����� �������� �ʴ´�.
									//��ø�� �ݺ������� �ٱ��� �ݺ������� �����Ű����
									//�ٱ��� �ݺ����� �̸�(Label)�� �ٿ��� ���
				}	
			}
		}
	System.out.println("���α׷� ���� ����");
	}
}
