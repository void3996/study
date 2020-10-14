package sec03.exam03.day74;

public class CarExample {

	public static void main(String[] args) {
		Car car1 = new Car();	//1 생성자 선택
		System.out.println("car1.company : " + car1.company);
	
		Car car2 = new Car("자가용");	//2 생성자 선택
		System.out.println("car2.company : " + car2.company);
		System.out.println("car2.model : " + car2.model);
		
		Car car3 = new Car("자가용", "빨강");//3 생성자 선택
		System.out.println("car3.company : " + car3.company);
		System.out.println("car3.model : " + car3.model);
		System.out.println("car3.color : " + car3.color);
		
		Car car4 = new Car("택시", "검정", 200);//4 생성자 선택
		System.out.println("car4.company : " + car4.company);
		System.out.println("car4.model : " + car4.model);
		System.out.println("car4.color : " + car4.color);
		System.out.println("car4.maxSpeed : " + car4.maxSpeed);
		
		//생성자가 오버로딩 되어 있을 경우 new 연산자로 생성자를 호출할 때 제공되는
		//매가값의 타입과 수에 의해 호출될 생성자가 결정된다.
	}

}
