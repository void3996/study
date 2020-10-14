package sec04.exam01.day76;

public class Caculator {
	
	//method
	void powerOn() {
		System.out.println("전원을 켭니다.");
	}
	
	int plus(int x, int y) {
		int result = x + y;
		return result;
	}
	
	double divide(int x, int y) {
		double result = (double)x / (double)y;
		return result;
	}
	
	void powerOff() {
		System.out.println("전원을 끕니다.");
	}
	//외부클래스에서 Calculator 클래스의 메소드를 호출하기 위해서는 
	//Calculator 객체를 생성하고 참조 변수를 이용해야 한다
}
