package sec04.exam03.day78;

public class CarExample {

	public static void main(String[] args) {
		Car myCar = new Car();
		
		myCar.setGas(5); //Car�� setGas() �޼ҵ� ȣ��
		//Car ��ü�� setGas(5) �޼ҵ带 ȣ���ؼ� Car ��ü�� gas �ʵ尪�� 5�� ����
		
		boolean gasState = myCar.isLeftGas();	//Car�� isLeftGas() �޼ҵ� ȣ��
		//isLeftGas() �޼ҵ带 ȣ���ؼ� ���ϰ��� gasState ������ ����
		
		if(gasState) {	//gasState �������� true�� ��� 16���ο��� run() �޼ҵ带 ȣ��
			System.out.println("����մϴ�.");
			myCar.run(); 	//Car�� run() �޼ҵ� ȣ��
		}
		
		if(myCar.isLeftGas()) {	//Car�� isLeftGas() �޼ҵ� ȣ���� ������ ������ isLeftGas()
								//�޼ҵ尡 boolean ���� �����ϱ� �����̴�. ���ϰ��� true�� ��� if
								//����� �����ϰ�, false�� ��� else ����� �����Ѵ�.
			System.out.println("gas�� ������ �ʿ䰡 �����ϴ�.");
		}else {
			System.out.println("gas�� �����ϼ���.");
		}
	}

}
