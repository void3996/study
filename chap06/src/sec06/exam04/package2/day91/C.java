package sec06.exam04.package2.day91;

import sec06.exam04.package1.day91.A;

//생성자의 접근 제한
public class C {
	//필드
	A a1 = new A(true);	//public
	//A a2 = new A(1);	//default 생성자 접근 불가
	//A a3 = new A("문자열");	//private 생성자 접근 불가
	//A a4 = new A(1.11);		//protected 생성자 접근 불가
}
