package sec02.exam08.day34;

public class CompareOperatorExample2 {

	public static void main(String[] args) {
		int v2 = 1;
		double v3 = 1.0;
		System.out.println(v2 == v3); 	//true
		
		double v4 = 0.1;
		float v5 = 0.1f;
		//실수의 저장방식인 부동 소수점 방식이 0.1을 정확하게 표현할 수 없다
		//0.1f는 0.1의 근사값이다.
		System.out.println(v4 == v5); 	//false
		System.out.println((float)v4 == v5); 	//true
		//피연산자를 float 타입으로 변환해서 비교하면 true를 결과로 출력할 수 있다.
	}
}
