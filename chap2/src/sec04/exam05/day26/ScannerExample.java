package sec04.exam05.day26;

import java.util.Scanner;

public class ScannerExample {
	
	public static void main(String[] args) {
		
			//생성된 변수를 scanner에 저장
		Scanner scanner = new Scanner(System.in);
		//Scanner 변수선언 	시스템의 입력 장치로부터 읽는 Scanner 생성
		String inputData;
		
		while (true) {
			inputData = scanner.nextLine();	//엔터키 이전까지 입력된 문자열을 읽음
			System.out.println("입력된 문자열:  \"" + inputData + "\"");
			if (inputData.equals("q")) {
				break;
			}//end if
			
		}//end while
		
		System.out.println("종료");
	}

}
