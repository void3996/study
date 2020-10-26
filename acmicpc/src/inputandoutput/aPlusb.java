package inputandoutput;

import java.util.Scanner;

//Class명은 Main으로 수정한다
public class aPlusb {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a, b;
		
		a = sc.nextInt();
		b = sc.nextInt();
		
		System.out.println(a+b);
	}
	//Scanner 클래스는 읽은 바이트를 문자, 정수, 실수, 불린, 문자열 등 다양한 타입으로 변환하여 리턴하는 클래스
	// 입력되는 키 값을 공백으로 구분되는 토큰 단위로 읽는다.
	//import java.util.Scanner; //기본적으로 import 문 필요

}
