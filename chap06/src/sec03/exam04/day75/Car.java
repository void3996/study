package sec03.exam04.day75;

public class Car {
	//�ʵ�
	String company = "�����ڵ���";
	String model;
	String color;
	int maxSpeed;
	
	//������
	Car() {
	}
	
	Car(String model) {
		//this()�� �ڽ��� �ٸ� �����ڸ� ȣ���ϴ� �ڵ�� �ݵ�� �������� ù �ٿ����� ���ȴ�
		this(model, "����", 250);
	}
	
	Car(String model, String color){
		this(model, color, 250);
	}

	public Car(String model, String color, int maxSpeed) {
		//���� ���� �ڵ�
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	//�ߺ��ڵ� �ּ�ȭ
}
