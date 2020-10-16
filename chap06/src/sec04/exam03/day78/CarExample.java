package sec04.exam03.day78;

public class CarExample {

	public static void main(String[] args) {
		Car myCar = new Car();
		
		myCar.setGas(5); //Car의 setGas() 메소드 호출
		//Car 객체의 setGas(5) 메소드를 호출해서 Car 객체의 gas 필드값을 5로 변경
		
		boolean gasState = myCar.isLeftGas();	//Car의 isLeftGas() 메소드 호출
		//isLeftGas() 메소드를 호출해서 리턴값을 gasState 변수에 저장
		
		if(gasState) {	//gasState 변수값이 true일 경우 16라인에서 run() 메소드를 호출
			System.out.println("출발합니다.");
			myCar.run(); 	//Car의 run() 메소드 호출
		}
		
		if(myCar.isLeftGas()) {	//Car의 isLeftGas() 메소드 호출이 가능한 이유는 isLeftGas()
								//메소드가 boolean 값을 리턴하기 떄문이다. 리턴값이 true일 경우 if
								//블록을 실행하고, false일 경우 else 블록을 실행한다.
			System.out.println("gas를 주입할 필요가 없습니다.");
		}else {
			System.out.println("gas를 주입하세요.");
		}
	}

}
