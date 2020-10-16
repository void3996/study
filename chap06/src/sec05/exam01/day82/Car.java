package sec05.exam01.day82;
//인스턴스 멤버와 this
public class Car {
	//필드
	String model;
	int speed;
	
	//생성자
	 public Car(String model) {
		super();
		this.model = model;
	}

	//메소드
	 void setSpeed(int speed) {
		 this.speed = speed;
		 
	 }
	 
	 void run() {
		 for (int i = 0; i < 51; i+= 10) {
			this.setSpeed(i);
			System.out.println(this.model + "가 달립니다.(시속:" + this.speed + "km/h)");
		}
	 }
	
	 
}
