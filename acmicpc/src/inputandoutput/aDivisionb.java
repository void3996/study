package inputandoutput;

import java.util.Scanner;

//Class명은 Main으로 수정한다
public class aDivisionb {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double a, b;
		
		a = sc.nextDouble();
		b = sc.nextDouble();
		
		System.out.println((double)a/b);
	}
	//
}
