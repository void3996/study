package sec04.exam04.day25;

public class QStopExample {

	public static void main(String[] args) throws Exception{
		int keyCode;
		
		while (true) {
			keyCode = System.in.read();
			System.out.println("keyCode: " + keyCode);
			if(keyCode == 113) {	//만약 keyCode가 113(q)과 동일하다면
				break;	//while 을 멈춰라
			}
		}	//end while
		
		System.out.println("종료");

	}

}
