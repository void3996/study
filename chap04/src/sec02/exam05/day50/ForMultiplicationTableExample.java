package sec02.exam05.day50;

public class ForMultiplicationTableExample {

	public static void main(String[] args) {
		
		//��ø�� for���� ������ Ƚ����ŭ �ݺ��ؼ� ����Ǵٰ� �ٽ� �ٱ��� for������ ���ư���
		for (int m = 2; m <= 9; m++) {	//�ٱ��� for ��
			System.out.println("*** "+m+ "�� ***");
			for (int n = 1; n <= 9; n++) {	//��ø for ��
				System.out.println(m + " x " + n + " = " + (m*n));
			}
		
		}
	}

}
