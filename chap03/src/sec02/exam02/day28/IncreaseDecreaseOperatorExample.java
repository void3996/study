package sec02.exam02.day28;

public class IncreaseDecreaseOperatorExample {

	public static void main(String[] args) {
		//++x �ٸ� ������ �����ϱ� ���� x�� ���� 1 ������Ŵ
		//--x �ٸ� ������ �����ϱ� ���� x�� ���� 1 ���ҽ�Ŵ
		//x++ �ٸ� ������ ������ �Ŀ� x�� ���� 1������Ŵ 
		//x-- �ٸ� ������ ������ �Ŀ� x�� ���� 1���ҽ�Ŵ 
		
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
