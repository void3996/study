package sec02.exam02.day48;

public class ForSumFrom1To100Example2 {

	public static void main(String[] args) {
		int sum = 0;
		
		int i = 0;	// 변수 i를 for문의 초기화식에서 선언하지 않고 for문 전에 선언하였다면
					// for 문 내부와 외부에서도 사용할 수 있다
		for (i=1; i <= 100; i++) {
			sum += i;
		}
		System.out.println("1~" + (i-1) + "합 : " + sum);
	}

}
