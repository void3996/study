package sec02.exam10.day55;

import java.util.Iterator;

public class ContinuewExample {

	public static void main(String[] args) {
		for (int i = 1; i < 11; i++) {
			if(i%2 != 0) {	// 2�� ���� �������� 0�� �ƴҰ��
				continue;	// ��� ���ο��� continue�� ����Ǹ� for���� ������ �Ǵ� while, 
							//do-while���� ���ǽ����� �̵��Ѵ�
			}
			System.out.println(i);	//Ȧ���� ������� ����
			//1~10 ������ �� �߿� ¦���� ��µ�
		}
	}

}
