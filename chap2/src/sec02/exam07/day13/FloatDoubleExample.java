package sec02.exam07.day13;

public class FloatDoubleExample {
	public static void main(String[] args) {
		//실수값 저장
		//float var1 = 3.14;	컴파일에러(Type mismatch
		float var2 = 3.14f;
		double var3 = 3.14;
		
		//정밀도 테스트
		float var4 = 0.1234567890123456789f;
		double var5 = 0.1234567890123456789;	
		//double타입인 var5가 float 타입인 var4보다 2배 이상 정밀한 겂으로 출력된다
		
		System.out.println("var2: " + var2);
		System.out.println("var3: " + var3);
		System.out.println("var4: " + var4);
		System.out.println("var5: " + var5);
		
		//e 또는 대문자 E가 포함되어 있는 숫자 리터럴은 지수와 가수로 표현된 소수점이 있는 10진수 실수로 인식한다
		double var6 = 3e6;
		float var7 = 3e6F;
		double var8 = 2e-3;
		System.out.println("var6: " + var6);
		System.out.println("var7: " + var7);
		System.out.println("var8: " + var8);
		
	}
}
