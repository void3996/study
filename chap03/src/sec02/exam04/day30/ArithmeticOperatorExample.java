package sec02.exam04.day30;

public class ArithmeticOperatorExample {
	public static void main(String[] args) {
		int v1 = 5;
		int v2 = 2;
		
		int result1 = v1 + v2;	//덧셈 연산
		System.out.println("result1=" + result1);
		int result2 = v1 - v2;	//뺄셈 연산
		System.out.println("result2=" + result2);
		int result3 = v1 * v2;	//곱셈 연산
		System.out.println("result3=" + result3);
		int result4 = v1 / v2;	//v1을 v2로 나눗셈 연산
		System.out.println("result4=" + result4);
		int result5 = v1 % v2;	//v1을 v2로 나눈 나머지를 구하는 연산
		System.out.println("result5=" + result5);
		double result6 = (double) v1 / v2;	//실수타입 결과를 얻기 위해 double로 강제 타입 변환한 후 산술연산
		System.out.println("result6=" + result6);
	}
}
