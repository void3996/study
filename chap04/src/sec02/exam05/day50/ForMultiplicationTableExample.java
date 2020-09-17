package sec02.exam05.day50;

public class ForMultiplicationTableExample {

	public static void main(String[] args) {
		
		//중첩된 for문은 지정된 횟수만큼 반복해서 실행되다가 다시 바깥쪽 for문으로 돌아간다
		for (int m = 2; m <= 9; m++) {	//바깥쪽 for 문
			System.out.println("*** "+m+ "단 ***");
			for (int n = 1; n <= 9; n++) {	//중첩 for 문
				System.out.println(m + " x " + n + " = " + (m*n));
			}
		
		}
	}

}
