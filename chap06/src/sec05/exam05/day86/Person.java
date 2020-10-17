package sec05.exam05.day86;
//final 필드 선언과 초기화
public class Person {
	//final 타입 필드는 초기값 선언
	final String nation = "Korea";	//final 필드는 저장된 초기값이 최종값이므로 수정 불가
	final String ssn;
	String name;
	
	//생성자
	public Person(String ssn, String name) {
		this.ssn = ssn;
		this.name = name;
	}
	
	
}
