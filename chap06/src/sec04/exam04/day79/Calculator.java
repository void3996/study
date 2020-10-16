package sec04.exam04.day79;
//클래스 내부에서 메소드 호출
public class Calculator {
	int plus(int x, int y) {
		int result = x + y;
		return result;
	}
	
	double avg(int x, int y) {
		double sum = plus(x, y);	// 4라인 plus 메소드 호출
		double result = sum / 2;
		return result;
	}
	
	void execute() {
		double result = avg(7, 10);	// 9라인 avg 메소드 호출
		println("실행결과: " + result);	//20라인 println 메소드 호출
	}

	private void println(String message) {
		System.out.println(message);
	}
	/*
	 * //CalculatorExample 실행했을때 Calculator 1. 16라인에서 호출이 제일 먼저 일어나서 avg() 메소드가
	 * 실행된다. 2. avg() 메소드의 10라인에서 호출이 일어나서 plus() 메소드가 실행된다. plus() 메소드가 리턴값을 주면
	 * avg() 메소드는 10라인에서 리턴값을 sum 변수에 저장하고 11라인을 실행한 후 12라인에서 execute() 메소드로 리턴값을
	 * 준다. 3. execute() 메소드는 16라인에서 avg() 메소드의 리턴값을 받아 17라인에서 println() 메소드를 호출할 때
	 * 매개 값으로 넘겨준다 마지막으로 execute() 18라인을 만나게 되고 종료된다.
	 */
}
