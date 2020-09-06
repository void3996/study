package sec01.exam05.day42;

public class SwitchExample {

	public static void main(String[] args) {
		int num = (int) (Math.random() * 6) + 1;	//주사위 번호 하나 뽑기
		
		//switch 문은 괄호 안의 변수 값과 동일한 값을 갖는 case로 가서 실행문을 실행한다.
		//만약 괄호 안의 변수 값과 동일한 값을 갖는 case가 없으면 default로 가서 실행문을 실행한다.
		//default는 생략 가능
		
		switch (num) {
		case 1:
			System.out.println("1번이 나왔습니다.");
			break;
		case 2:
			System.out.println("2번이 나왔습니다.");
			break;
		case 3:
			System.out.println("3번이 나왔습니다.");
			break;
		case 4:
			System.out.println("4번이 나왔습니다.");
			break;
		case 5:
			System.out.println("5번이 나왔습니다.");
			break;
				
		default:
			System.out.println("6번이 나왔습니다.");
			break;
		}
		

	}

}
