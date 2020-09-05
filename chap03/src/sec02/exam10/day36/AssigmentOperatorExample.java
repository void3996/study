package sec02.exam10.day36;

public class AssigmentOperatorExample {
	public static void main(String[] args) {
		int result = 0;
		result += 10;	//result = result+10 과 동일
		
		System.out.println("result=" + result);
		result -= 5;	//result = result-5 와 동일
		System.out.println("result=" + result);
		result *= 3;	//result = result*3 과 동일
		System.out.println("result=" + result);
		result /= 5;	//result = result/5 와 동일
		System.out.println("result=" + result);
		result %= 3;	//result = result%3 과 동일
		System.out.println("result=" + result);
		
	}
}
