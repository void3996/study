package sec02.exam05.day61;

public class MainStringArrayArgument {

	public static void main(String[] args) {
		if (args.length != 2) {	//�Էµ� ������ ������ 2���� �ƴҰ��
			System.out.println("���� ���� �����մϴ�.");
			System.exit(0);	//���α׷� ���� ����
		}
		
		String strNum1 = args[0];	//ù��° ������ ���
		String strNum2 = args[1];	//�ι�° ������ ���
		
		int num1 = Integer.parseInt(strNum1);	//���ڿ��� ������ ��ȯ;
		int num2 = Integer.parseInt(strNum2);	//���ڿ��� ������ ��ȯ;
		
		int result = num1 + num2;
		System.out.println(num1 + " + " + num2 + " = " + result);
		
	}

}
