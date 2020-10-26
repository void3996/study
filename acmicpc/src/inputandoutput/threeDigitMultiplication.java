package inputandoutput;

import java.util.Scanner;

//Class명은 Main으로 수정한다
public class threeDigitMultiplication {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a, b;
		
		a = sc.nextInt();
		b = sc.nextInt();
		
		System.out.println(a*(b%10));
		System.out.println(a*(b%100 - b%10)/10);
		System.out.println(a*(b%100));
		System.out.println(a*b);
		System.out.println(b%10);
	}

}
