package sec06.exam04.package1.day91;
//생성자의 접근 제한
public class A {
	//필드
	A a1 = new A(true);
	A a2 = new A(1);
	A a3 = new A("문자열");
	A a4 = new A(1.11);
	//생성자
	public A(boolean b) {	//public 접근 제한	모든 패키지에서 아무런 제한 없이 생성자 호출 가능
	}						
	A(int b) {}				//defalut 접근 제한 같은 패키지에서 아무런 제한 없이 생성자 호출가능
							//			다른 패키지에서는 생성자 호출 불가
	private A(String s) {}	//private 접근제한	 오직 클래스 내부에서만 생성자 호출 및 객체 생성 가능
	protected A(double b) {}//protected 접근제한 같은 패키지에 속하는 클래스에서 생성자 호출 가능
							//다른 패키지에 속한 클래스가 해당 클래스의 child 클래스라면 생성자 호출 가능
}
