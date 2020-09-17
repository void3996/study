package sec02.exam09.day54;

public class BreakOutterExample {

	public static void main(String[] args) {
		Label: for (char upper = 'A'; upper <= 'Z'; upper++) {
			for (char lower = 'a'; lower <= 'z'; lower++) {
				System.out.println(upper + "-" + lower);
				if (lower=='g') {
					break Label;	//반복문 중첩되어 있을 경우 break 문은 가장 가까운 반복문만 종료하고
									//바깥쪽 반복문은 종료하지 않는다.
									//중첩된 반복문에서 바깥쪽 반복문까지 종료시키려면
									//바깥쪽 반복문에 이름(Label)을 붙여서 사용
				}	
			}
		}
	System.out.println("프로그램 실행 종료");
	}
}
