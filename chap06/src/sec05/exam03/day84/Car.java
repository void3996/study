package sec05.exam03.day84;
//정적 메소드 선언 시 주의할 점
public class Car {
	int speed;
	
	void run() {
		System.out.println(speed + "으로 달립니다.");
	}
	
	public static void main(String[] args) {
		Car myCar = new Car();
		myCar.speed = 60;
		myCar.run();
		
		//this.speed = 60; 정적메소드의 경우 이렇게 작성 불가
	}
	
	//정적 메소드를 선언할 때는 내부에 인스턴스 필드나 인스턴스 메소드를 사용할 수 없다
	//객체 자신의 참조인 this 키워드도 사용이 불가능하다

}
