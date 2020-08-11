package sec01.exam01.day3;

public class VariableInitializationExample {

	public static void main(String[] args) {
		
		//int value; 로 작성하면 컴파일 에러 발생
		//변수 정수(int) value를 선언
		int value;
		//위에 선언한 변수에 30을 담았다
		value = 30;
		
		//변수 value 값을 읽고 10을 더하는 산술 연산을 수행
		//연산의 결과값을 변수 정수(int) result의 초기값으로 저장
		int result = value + 10;
		//변수 result 값을 읽고 콘솔에 출력
		System.out.println(result);
	}

}
