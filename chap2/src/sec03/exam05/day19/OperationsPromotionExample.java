package sec03.exam05.day19;

public class OperationsPromotionExample {

	public static void main(String[] args) {
		byte byteValue1 = 10;	//byteValue1에 10을 담음
		byte byteValue2 = 20;	//byteValue2에 20을 담음
		
		//byte byteValue3 = byteValue1 + byteValue2; 정수연산일 경우 int 타입을 기본으로 한다
		byte byteValue3 = (byte) (byteValue1 + byteValue2); //그렇기에 괄호로 묶어 연산한 값을 byte로 강제 형변환하여 byte 로 받던가
		int intValue1 = byteValue1 + byteValue2;	//아니면 결과값을 int 로 받아야 컴파일 에러가 발생되지 않는다.
		
		System.out.println(byteValue3);
		System.out.println(intValue1);
		
		char charValue1 = 'A';
		char charValue2 = 1;
		//char charValue3 = charValue1 + charValue2; //산술연산으로 진행할 경우 char 로 받지 못한다
		char charValue3 = (char) (charValue1 + charValue2);
		int intValue2 = charValue1 + charValue2;	//char 타입이 	산술연산이 될 경우 int 타입으로 변환	
		System.out.println("유니코드=" + intValue2);
		System.out.println("출력문자=" + charValue3);
		System.out.println("출력문자=" + (char)intValue2);
		
		int intValue3 = 10;
		int intValue4 = intValue3/4;
		System.out.println(intValue4);
		
		int intValue5 = 10;
		//int intValue6 = 10 / 4.0;	double 타입으로 받아야 컴파일 에러가 발생하지 않는다.
		double doubleValue = intValue5 / 4.0;
		System.out.println(doubleValue);
		
		int x = 1;
		int y = 2;
		double result = (double) x / y;	//실수를 출력할 수 있다
		System.out.println(result);
	}

}
