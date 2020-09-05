package sec02.exam09.day35;

public class LogicalOperatorExample {

	public static void main(String[] args) {
		
		// && 또는 & 는 AND(논리곱) 이다.
		// || 또는 | 는 OR(논리합) 이다.
		// ^ 는 XOR(배타적 논리합) 이다. 피연산자가 하나는 true이고 다른 하나가 false 일 경우에만 연산결과가 true
		// ! 는 NOT(논리 부정) 이다.
		
		int charCode = 'A';
		
		if ((charCode>=65) && (charCode<=90)) {
			System.out.println("대문자군요");
		}
		if ((charCode>=97) && (charCode<=122)) {
			System.out.println("소문자군요");
		}
		if (!(charCode<48) && !(charCode>57)) {
			System.out.println("0~9 숫자군요");
		}
		
		int value = 6;
		
		if ((value%2==0) | (value%3==0)) {
			System.out.println("2 또는 3의 배수군요");
		}
		if ((value%2==0) || (value%3==0)) {
			System.out.println("2 또는 3의 배수군요");
		}
		
	}

}
