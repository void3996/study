package sec05.exam01.day82;
//�ν��Ͻ� ����� this
public class Car {
	//�ʵ�
	String model;
	int speed;
	
	//������
	 public Car(String model) {
		super();
		this.model = model;
	}

	//�޼ҵ�
	 void setSpeed(int speed) {
		 this.speed = speed;
		 
	 }
	 
	 void run() {
		 for (int i = 0; i < 51; i+= 10) {
			this.setSpeed(i);
			System.out.println(this.model + "�� �޸��ϴ�.(�ü�:" + this.speed + "km/h)");
		}
	 }
	
	 
}
