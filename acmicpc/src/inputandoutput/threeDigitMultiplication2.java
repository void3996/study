package inputandoutput;

import java.util.Scanner;

public class threeDigitMultiplication2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 
		int a, b;

		a = sc.nextInt();
		b = sc.nextInt();
		
		int b1 = b%10; 
		int b2 = b%100-b1;
		int b3 = b-b1-b2;
		
		System.out.println(a*b1);
		System.out.println(a*b2/10);
		System.out.println(a*b3/100);
		System.out.println(a*b);
		
	}

}
