package sec02.exam03.day9;

public class LongExample {

	public static void main(String[] args) {
		
		long var1 = 10;
		long var2 = 20L;
		
		//long var3 = 10000000000;	컴파일 에러 발생, 정수 리터럴 뒤에 소문자 l이나 대문자 L을 붙이면 컴파일 에러가 해결된다.
		long var4 = 10000000000L;
		
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var4);
	}

}
