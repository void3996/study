package sec02.exam01.day70;

public class CarExample {

	public static void main(String[] args) {
		//��ü ����
		Car myCar = new Car();
		//�ʵ尪 �б�
		System.out.println("����ȸ��: " + myCar.company);
		System.out.println("�𵨸�: " + myCar.model);
		System.out.println("����: " + myCar.color);
		System.out.println("�ְ�ӵ�: " + myCar.maxSpeed);
		System.out.println("����ӵ�: " + myCar.speed);	//Car class���� �ʵ弱��� �ʱⰪ ���Է�
		//�ʵ尪 ����
		myCar.speed = 60;
		System.out.println("������ �ӵ�: " + myCar.speed);
	}

}
