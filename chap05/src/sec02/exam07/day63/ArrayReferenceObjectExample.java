package sec02.exam07.day63;

public class ArrayReferenceObjectExample {

	public static void main(String[] args) {
		String[] strArray = new String[3];
		strArray[0] = "Java";
		strArray[1] = "Java";
		strArray[2] = new String("Java");
		
		System.out.println(strArray[0] == strArray[1]);
		System.out.println(strArray[0] == strArray[2]);	//false 값 리턴 [0]과 [2]는 서로 다른 객체를 참조하기 때문
		System.out.println(strArray[0].equals(strArray[2]));	//문자열을 비교하는 equals는 true 값 리턴
		
	}

}
