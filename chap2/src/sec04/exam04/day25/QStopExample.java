package sec04.exam04.day25;

public class QStopExample {

	public static void main(String[] args) throws Exception{
		int keyCode;
		
		while (true) {
			keyCode = System.in.read();
			System.out.println("keyCode: " + keyCode);
			if(keyCode == 113) {	//���� keyCode�� 113(q)�� �����ϴٸ�
				break;	//while �� �����
			}
		}	//end while
		
		System.out.println("����");

	}

}
