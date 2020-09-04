package sec02.exam03.day29;

public class DenyLogicOperatorExample {

	public static void main(String[] args) {
		// !는 논리 부정 연산자
		boolean play = true;	
		
		System.out.println(play);	//play는 true이다
		
		play = !play;	//play를 부정
		System.out.println(play);	//true를 부정하였으므로 play는 false이다.
		
		play = !play;	//부정한 play를 부정
		System.out.println(play);	//false인 play를 부정하였으니 play는 true이다.

	}

}
