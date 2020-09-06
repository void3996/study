package sec01.exam04.day41;

public class IfDiceExample {

	public static void main(String[] args) {
		int num = (int)(Math.random() * 6) + 1; //주사위 번호 하나 뽑기
						//(0~5 숫자중 하나가 나옴) + 1
						//Math.random method는 0.0과 1.0 사이에 속하는 double 타입의 난수 하나를 리턴한다
						//0.0은 범위에 포함되고 1.0은 포함되지 않는다
		
		if(num==1) {
			System.out.println("1번이 나왔습니다.");
		}else if (num==2) {
			System.out.println("2번이 나왔습니다.");
		}else if (num==3) {
			System.out.println("3번이 나왔습니다.");
		}else if (num==4) {
			System.out.println("4번이 나왔습니다.");
		}else if (num==5) {
			System.out.println("5번이 나왔습니다.");
		}else {
			System.out.println("6번이 나왔습니다.");
		}
	}

}
