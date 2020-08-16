package sec03.exam02.day16;

public class CastingExample {

	public static void main(String[] args) {
		int intValue = 44032;
		char charValue = (char) intValue;	//char 타입으로 강제 타입변환 유니코드 10진 값 44032는 '가' 이다
		System.out.println(charValue);
		
		long longValue = 500;
		intValue = (int) longValue;	// int타입으로 강제 타입변환 int 타입 표현 범위내이기에 그대로 표기된다.
		System.out.println(intValue);
		
		double doubleValue = 3.14;
		intValue = (int) doubleValue;	//int 타입으로 강제 타입변환되어 소수점 이하부분 버려지고 정수부분만 저장
		System.out.println(intValue);

	}

}
