package sec03.exam04.day75;

public class Car {
	//필드
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	
	//생성자
	Car() {
	}
	
	Car(String model) {
		//this()는 자신의 다른 생성자를 호출하는 코드로 반드시 생성자의 첫 줄에서만 허용된다
		this(model, "은색", 250);
	}
	
	Car(String model, String color){
		this(model, color, 250);
	}

	public Car(String model, String color, int maxSpeed) {
		//공통 실행 코드
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	//중복코드 최소화
}
