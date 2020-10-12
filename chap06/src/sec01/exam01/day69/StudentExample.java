package sec01.exam01.day69;

public class StudentExample {

	public static void main(String[] args) {
		Student s1 = new Student();
		System.out.println("s1 변수가 Student 객체를 참조합니다.");
		
		Student s2 = new Student();
		System.out.println("s2 변수가 또 다른 Student 객체를 참조합니다.");
		//같은 클래스로부터 생성되었지만 s1과 s2가 참조하는 Student 객체는 완전히 독립된 서로 다른 객체다
		
		//Student는 라이브러리 클래스이고
		//StudentExample 은 실행클래스이다
	}

}
