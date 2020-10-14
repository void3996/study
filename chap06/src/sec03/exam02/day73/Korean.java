package sec03.exam02.day73;

public class Korean {
	
	//필드
	String nation = "대한민국";
	String name;
	String ssn;
	
	
	/*//생성자
	 * public Korean(String n, String s) { name = n; ssn = s;
	 * 
	 * }
	 */
	//this를 이용하여 Korean 생성자를 수정
	public Korean(String name, String ssn) {
		
		this.name = name;
		this.ssn = ssn;
	}
	
	
	
}
