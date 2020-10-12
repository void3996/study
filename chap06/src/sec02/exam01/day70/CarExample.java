package sec02.exam01.day70;

public class CarExample {

	public static void main(String[] args) {
		//객체 생성
		Car myCar = new Car();
		//필드값 읽기
		System.out.println("제작회사: " + myCar.company);
		System.out.println("모델명: " + myCar.model);
		System.out.println("색상: " + myCar.color);
		System.out.println("최고속도: " + myCar.maxSpeed);
		System.out.println("현재속도: " + myCar.speed);	//Car class에서 필드선언시 초기값 미입력
		//필드값 변경
		myCar.speed = 60;
		System.out.println("수정된 속도: " + myCar.speed);
	}

}
