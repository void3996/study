package sec02.exam08.day14;

public class BooleanExample {
	public static void main(String[] args) {
		boolean stop = true;	//stop 일 경우 참이다
		boolean state = false;	//state일 경우 거짓이다
		if(stop) {	//만약 stop이 참일 경우 중지한다
			System.out.println("중지합니다.");
		}else {	//stop이 거짓일 경우 시작한다
			System.out.println("시작합니다.");
		}
		if(state) {	//state가 참일 경우 중지한다
			System.out.println("중자힙니다.");
		}else {	//state가 거짓일 경우 시작한다
			System.out.println("시작합니다.");
		}
	}
}
