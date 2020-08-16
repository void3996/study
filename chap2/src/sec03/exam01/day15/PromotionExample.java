package sec03.exam01.day15;

public class PromotionExample {

	public static void main(String[] args) {
		// 자동 타입 변환은 값의 허용 범위가 작은 타입이 허용범위가 큰 타입으로 저장될때 발생한다.
		//byte < short < int < long < float < double
		byte byteValue = 10;
		int intValue = byteValue;	//int 타입이 byte 타입보다 허용범위가 더 크기 때문에 자동 타입 변환 된다.
		System.out.println("intValue: " + intValue);
		
		char charValue = '가';
		intValue = charValue;	//char 타입인 경우 int 타입으로 자동 타입 변환 되면 유니코드 값이 int 타입에 저장된다.
		System.out.println("가의 유니코드: " + intValue);
		
		intValue = 50;
		long longValue = intValue;	//long 타입이 int 타입보다 허용범위가 더 크기 때문에 자동 타입 변환 돤디.
		System.out.println("longValue: " + longValue);
		
		longValue = 100;
		float floatValue = longValue;
		System.out.println("floatValue: " + floatValue);
		
		floatValue = 100.5F;
		double doubleValue = floatValue;
		System.out.println("doubleValue: " + doubleValue);
	}

}
