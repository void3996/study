package sec05.exam05.day86;

public class PersonExample {

	public static void main(String[] args) {
		Person p1 = new Person("123456-1234567", "홍길동");
		
		System.out.println(p1.nation);
		System.out.println(p1.ssn);
		System.out.println(p1.name);
		
		//p1.nation = "usa";	final 필드는 한번 초기화 되면 수정 불가
		//p1.ssn = "654321-7654321";
		
		p1.name = "홍삼원";
	}

}
