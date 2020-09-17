package sec02.exam10.day55;

import java.util.Iterator;

public class ContinuewExample {

	public static void main(String[] args) {
		for (int i = 1; i < 11; i++) {
			if(i%2 != 0) {	// 2로 나눈 나머지가 0이 아닐경우
				continue;	// 블록 내부에서 continue가 실행되면 for문의 증감식 또는 while, 
							//do-while문의 조건식으로 이동한다
			}
			System.out.println(i);	//홀수는 실행되지 않음
			//1~10 사이의 수 중에 짝수만 출력됨
		}
	}

}
