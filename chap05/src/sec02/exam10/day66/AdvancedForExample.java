package sec02.exam10.day66;

public class AdvancedForExample {

	public static void main(String[] args) {
		int[] scores = {95, 71, 84, 93, 87};
		
		int sum=0;
		for (int i : scores) {
			sum = sum + i;
		}
		
//		for (2 Ÿ�Ժ��� : 1 �迭) {	������ for���� ó�� ����� �� �迭(1) ���� ������ ù��° ���� �����ϴ��� ��
//			3 ���๮;	 ������ ���� �����ϸ� ����(2)�� ����
//					 ���๮(3)�� ����
//					 ��� ���� ���๮(3) �� ����Ǹ� �ٽ� ������ ���� �迭(1)���� ������ �������� �����ϴ��� ��
//					 ���� �׸��� �����ϸ� 2->3->1 ������ ������ �ٽ� �����ϰ� ������ �����׸��� ������ for�� ����
//		}
		System.out.println("���� ���� = " + sum);
		
		double avg = (double) sum / scores.length;
		System.out.println("���� ��� = " + avg);
	}

}
