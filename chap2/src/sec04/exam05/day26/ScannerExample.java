package sec04.exam05.day26;

import java.util.Scanner;

public class ScannerExample {
	
	public static void main(String[] args) {
		
			//������ ������ scanner�� ����
		Scanner scanner = new Scanner(System.in);
		//Scanner �������� 	�ý����� �Է� ��ġ�κ��� �д� Scanner ����
		String inputData;
		
		while (true) {
			inputData = scanner.nextLine();	//����Ű �������� �Էµ� ���ڿ��� ����
			System.out.println("�Էµ� ���ڿ�:  \"" + inputData + "\"");
			if (inputData.equals("q")) {
				break;
			}//end if
			
		}//end while
		
		System.out.println("����");
	}

}
