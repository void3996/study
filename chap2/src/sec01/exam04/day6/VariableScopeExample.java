package sec01.exam04.day6;

public class VariableScopeExample {

	public static void main(String[] args) {
		int v1 = 15;	//변수 v1에 15를 담았다
		
		if (v1 > 10) {	//조건문 if 만약 v1이 10보다 크다면
			int v2;		//변수 v2 선언
			v2 = v1 - 10;	//v1(15) - 10을 v2에 담아라
		}
		//int v3 = v1 + v2 + 5;	v2는 if문 { } block 안에서 선언된 변수이기 때문에 외부에서 사용하지 못한다
		
	}

}
