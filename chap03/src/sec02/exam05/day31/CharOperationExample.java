package sec02.exam05.day31;

public class CharOperationExample {

	public static void main(String[] args) {
		
		char c1 = 'A' + 1;	//char c1 = 66; 으로 컴파일된다 리터럴 간의 연산은
							//컴파일 단계에서 수행하기 때문에 타입 변환이 없다.
		char c2 = 'A';
		//char c3 = c2 + 1;	//char 변수가 산술 연산에 사용되면 int 타입으로 변환되므로 연산결과는 int 타입이된다.
		char c3 = (char) (c2 + 1);	//강제 타입 변환으로 컴파일 에러 없이 결과를 얻을수 있다.
		System.out.println("c1: " + c1);
		System.out.println("c2: " + c2);
		System.out.println("c3: " + c3);
	}

}
