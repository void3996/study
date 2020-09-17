package sec02.exam08.day53;

public class BreakExample {

	public static void main(String[] args) {
		while (true) {
			int num = (int) (Math.random() * 6 + 1);	
			System.out.println(num);
			if (num == 6) {	//num 이 6 과 같다면 break 실행
			break;
			
			}
		}
		System.out.println("프로그램 종료");
	}
}
