package sec02.exam06.day12;

public class EscapeExample {

	public static void main(String[] args) {
		System.out.println("번호\t이름\t직업");	// \t는 탭만큼 띄운다는 의미이다
		System.out.print("행 단위 출력 \n");	//	\n은 줄 바꿈 의미이다
		System.out.print("행 단위 출력 \r");	// \r은 캐리지 리턴이다
		System.out.println("우리는 \"개발자\" 입니다.");	//	\"는 "를 출력한다
		System.out.print("봄\\여름\\가을\\겨울");	//	\\를 입력하면 \ 가 출력된다.

	}

}
