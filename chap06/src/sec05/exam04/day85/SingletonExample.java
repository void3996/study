package sec05.exam04.day85;

public class SingletonExample {

	public static void main(String[] args) {
		/*
		 * Singleton obj1 = new Singleton(); 
		 * Singleton obj2 = new Singleton();	������ ����
		 */
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();
		//getInstance �޼ҵ�� �� �ϳ��� ��ü�� �����ϱ� ������ obj1, obj2�� ������ ��ü�� �����Ѵ�
		
		if (obj1 == obj2) {
			System.out.println("���� Singleton ��ü�Դϴ�.");
		}else {
			System.out.println("�ٸ� Singleton ��ü�Դϴ�.");
		}
		
	}

}
