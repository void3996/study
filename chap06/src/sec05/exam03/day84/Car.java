package sec05.exam03.day84;
//���� �޼ҵ� ���� �� ������ ��
public class Car {
	int speed;
	
	void run() {
		System.out.println(speed + "���� �޸��ϴ�.");
	}
	
	public static void main(String[] args) {
		Car myCar = new Car();
		myCar.speed = 60;
		myCar.run();
		
		//this.speed = 60; �����޼ҵ��� ��� �̷��� �ۼ� �Ұ�
	}
	
	//���� �޼ҵ带 ������ ���� ���ο� �ν��Ͻ� �ʵ峪 �ν��Ͻ� �޼ҵ带 ����� �� ����
	//��ü �ڽ��� ������ this Ű���嵵 ����� �Ұ����ϴ�

}
