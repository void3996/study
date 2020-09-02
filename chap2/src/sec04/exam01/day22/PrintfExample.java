package sec04.exam01.day22;

public class PrintfExample {

	public static void main(String[] args) {
		int value = 123;
		//print(내용) : 괄호 안의 내용을 출력만 해라
		//print(내용) : 골호 안의 내용을 출력하고 행을 바꿔라
		//printf("형식문자열", 값1, 값2, ...) : 괄호 안의 첫번쨰 문자열 형식대로 내용을 출력해라
		//%d : 정수
		//%6d 6자리 정수. 왼쪽 빈자리 공백
		//%-6 6자리 정수. 오른쪽 빈자리 공백
		//%06d 6자리 정수. 왼쪽 빈자리 0으로 채움
		//%10.2f 소수점 이상 7자리, 소수점 이하 2자리. 왼쪽 빈자리 공백
		//%-10.2f 소수점 이상 7자리, 소수점 이하 2자리. 오른쪽 빈자리 공백
		//%010.2f 소수점 이상 7자리, 소수점 이하 2자리. 왼쪽 빈자리 0 채움
		//%s 문자열
		//%6s 6자리 문자열. 왼쪽 빈자리 공백
		//%6s 6자리 문자열. 오른쪽 빈자리 공백
		// \t tab
		// \n 줄바꿈
		// %% %
		
		System.out.printf("상품의 가격:%d원\n", value);
		System.out.printf("상품의 가격:%6d원\n", value);
		System.out.printf("상품의 가격:%-6d원\n", value);
		System.out.printf("상품의 가격:%06d원\n", value);
		System.out.printf("상품의 가격:%d원\n", value);
		
		double area = 3.14159 * 10 * 10;
		System.out.printf("반지름이 %d인 원의 넓이:%10.2f\n", 10, area);
		
		String name = "홍길동";
		String job = "도적";
		System.out.printf("%6d | %-10s | %10s\n", 1, name, job);

	}

}
