package sec02.exam07.day33;

public class CompareOperatorExample1 {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 10;
		boolean result1 = (num1 == num2);	// ==은 값이 같은지 비교한다
		boolean result2 = (num1 != num2);	// !=은 값이 다른지 검사한다
		boolean result3 = (num1 <= num2);	// <=은 왼쪽의 피연산자가 작거나 같은지를 검사한다.
		System.out.println("result1=" + result1);
		System.out.println("result2=" + result2);
		System.out.println("result3=" + result3);
		
		char char1 = 'A';
		char char2 = 'B';
		boolean result4 = (char1 < char2);	
		//피연산자가 char타입이면 유니코드 값으로 비교 연산을 수행한다
		System.out.println("result4=" + result4);
	}

}
