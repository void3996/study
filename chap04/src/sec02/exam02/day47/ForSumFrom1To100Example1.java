package sec02.exam02.day47;

public class ForSumFrom1To100Example1 {

	public static void main(String[] args) {
		int sum = 0;
			//정수 i 에 0 을 담았다; i 가 100보다 같거나 작으면 true 아니면 false; 먼저 해당 연산을 수행하고 나서 i의 값을 1 증가시킴
		for (int i = 0; i <= 100; i++) {
			sum += i;
		}
		System.out.println("1~100 합 : " + sum);
	}

}
