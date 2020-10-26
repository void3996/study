package inputandoutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class threeDigitMultiplication3 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int a = Integer.parseInt(br.readLine());
		String B = br.readLine();
		
		char[] b = B.toCharArray();
		
		System.out.println(a*(b[2]-'0'));
		System.out.println(a*(b[1]-'0'));
		System.out.println(a*(b[0]-'0'));
	}

}
