package sec02.exam01.day46;

public class ForPrintFrom1to10Example {

	public static void main(String[] args) {
		
//		for (1. 초기화식; 2. 조건식; 4. 증감식) {
//			조건식이 true일 경우
//			3. 실행문
//		}
		//1 초기화식 실행 -> 2 true이면 { } 내부에 3 실행문을 실행, false면 
		//내부에 3 실행문이 실행되면 증감식 4를 실행하고 조건식 2의 true, false  평가
		//2 조건식의 평가 결과가 true이면 3 실행문 -> 4 증감식 -> 2 조건식 으로 다시 진행
		//2 조건식이 false가 될때까지 반복된다
		
		
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}
	}

}
