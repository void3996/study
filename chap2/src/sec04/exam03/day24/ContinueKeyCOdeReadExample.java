package sec04.exam03.day24;

public class ContinueKeyCOdeReadExample {

	public static void main(String[] args) throws Exception {
		
		int keyCode;
		
		while(true) {
			keyCode = System.in.read();
			System.out.println("keyCode: " + keyCode);
			
			//while문은 break가 없으므로 무한 반복 실행된다.
		}
	}

}
