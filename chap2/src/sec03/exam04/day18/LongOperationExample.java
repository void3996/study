package sec03.exam04.day18;

public class LongOperationExample {

	public static void main(String[] args) {
		byte value1 = 10;
		int value2 = 100;
		long value3 = 1000L;
		long result = value1 + value2 + value3;	
		//int 타입보다 허용범위가 더 큰 long 타입이 피연산자로 사용되면 다른 피편산자는 무조건 long 타입으로 변환하고 연산을 수행한다.
		//연산 결과를 long 타입 변수에 저장해야 한다
		System.out.println(result);

	}

}
