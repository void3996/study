package sec02.exam04.day49;

public class ForFloatCounterExample {

	public static void main(String[] args) {
		for (float x = 0.1f; x <= 1.0f; x+=0.1f) {
			System.out.println(x);
			//float 타입은 0.1을 정확하게 표현할 수 없다. 실제 값은 0.1보다 약간 크다
		}
	}

}
