package sec01.exam03.day5;

public class VariableExchangeExample {

	public static void main(String[] args) {
		int x = 3;	//변수 x에 3을 담았다
		int y = 5;	//변수 y에 5를 담았다
		System.out.println("x: " + x + ", y: " + y);	//변수 x와 y의 값을 출력

		int temp = x;	//변수 temp에 변수 x(3)를 담았다.
		
		x = y;	//변수 x에 변수 y(5)를 담았다.
		y = temp;	//변수 y에  변수 temp(3)을 담았다.
		System.out.println("x: " + x + ", y: " + y);	//변수 x와 y의 값을 출력
	}

}
