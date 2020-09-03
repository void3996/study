package sec04.exam02.day23;

public class KeyCodeExample {

	public static void main(String[] args) throws Exception{
			//읽은 키코드를 변수에 저장
		//int keyCode = System.in.read();
					//시스템이 가지고 있는.입력장치에서.입력된 키코드를 읽어라
		int keyCode;
		
		keyCode = System.in.read();	//a를 입력하고 엔터키를 치면
		System.out.println("keyCode: " + keyCode);	// a 에대한 키코드 97 출력된다.
		
		keyCode = System.in.read();
		System.out.println("keyCode: " + keyCode);	//그다음 엔터에 대한 키코드 13이 출력된다
		//엔터키는 다른키와 다르게 CR(캐리지리턴)과 LF(라인 피드) 로 구성된 키코드가 입력된다
		
		keyCode = System.in.read();
		System.out.println("keyCode: " + keyCode);	//그래서 LF에 해당하는 키코드 10이 출력된다
	}

}
