package sec02.exam07.day52;

public class WhileSumFrom1To100Example {

	public static void main(String[] args) {
		int sum = 0;	//sum 은 합계를 저장할 변수
		
		int i = 1;	// i 는 루프 카운터 변수
		//while문 내부에서 계속 누적되는 값을 갖는 루프 카운터 변수는 while 문 시작하기 전에 미리 선언해야한다
		
		while (i<=100) {
			sum += i;
			i++;
		}
		System.out.println("1~" + (i-1) + " 합 : " + sum);
		//1~100까지 합
	}

}
