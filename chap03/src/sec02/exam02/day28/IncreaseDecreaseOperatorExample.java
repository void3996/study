package sec02.exam02.day28;

public class IncreaseDecreaseOperatorExample {

	public static void main(String[] args) {
		//++x 다른 연산을 수행하기 전에 x의 값을 1 증가시킴
		//--x 다른 연산을 수행하기 전에 x의 값을 1 감소시킴
		//x++ 다른 연산을 수행한 후에 x의 값을 1증가시킴 
		//x-- 다른 연산을 수행한 후에 x의 값을 1감소시킴 
		
		int x = 10;
		int y = 10;
		int z;
		
		System.out.println("---------------");
		x++;
		++x;
		System.out.println("x=" + x);
		
		System.out.println("---------------");
		y--;
		--y;
		System.out.println("y=" + y);
		
		System.out.println("---------------");
		z = x++;
		System.out.println("z=" + z);
		System.out.println("x=" + x);
		
		System.out.println("---------------");
		z = ++x;
		System.out.println("z=" + z);
		System.out.println("x=" + x);

		System.out.println("---------------");
		z = ++x + y++;
		System.out.println("z=" + z);
		System.out.println("x=" + x);
		System.out.println("y=" + y);
		
	
	}

}
