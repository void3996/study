package sec04.exam05.day80;
//Ŭ���� �ܺο��� �޼ҵ� ȣ��
public class Car {
	//�ʵ�
	int speed;
	//������
	
	//�޼ҵ�
	int getSpeed() {
		return speed;
	}
	
	void keyTurnOn() {
		System.out.println("Ű�� �����ϴ�.");
	}
	
	void run() {
		for (int i = 10; i < 51; i+=10) {
			speed = i;
			System.out.println("�޸��ϴ�.(�ü�:" + speed + "km/h)");
		}
	}
}
