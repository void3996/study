package sec06.exam06.day93;
//Getter와 Setter 메소드 사용
public class CarExample {

	public static void main(String[] args) {
		Car myCar = new Car();
		
		//잘못된 속도 변경
		myCar.setSpeed(-50);
		
		System.out.println("현재 속도: " + myCar.getSpeed());
		//잘못된 속도 변경 시도하지만 speed 필드의 Setter(setSpeed()) 에서 매개값을 검사한 후 0으로 변경하기 때문에
		//10라인의 Getter(getSpeed())의 리턴값은 0으로 나온다
		//올바른 속도 변경
		myCar.setSpeed(60);
		
		//멈춤
		if (myCar.isStop()) {
			myCar.setStop(true);
		//stop 필드의 Getter(isStop()) 리턴 값이 false일 경우, 자동차를 멈추기 위해 Setter(setStop(true))를
			//호출해서 stop 필드를 true로, speed 필드를 0으로 변경한다
		}
		
		System.out.println("현재 속도 : " + myCar.getSpeed());
	}

}
