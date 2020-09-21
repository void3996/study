package sec02.exam01.day57;

public class ArrayCreateByValueListExample1 {

	public static void main(String[] args) {
		int[] scores = {83, 90, 87};
		
		System.out.println("scores[0] : " + scores[0]);	// 83
		System.out.println("scores[0] : " + scores[1]);	// 90
		System.out.println("scores[0] : " + scores[2]);	// 87
		
		int sum = 0;
		for (int i = 0; i < 3; i++) {
			sum += scores[i];	//ÃÑÇÕ 260
		}	
		System.out.println("ÃÑÇÕ : " + sum);
		double avg = (double) sum / 3;	//Æò±Õ 86.6666...
		System.out.println("Æò±Õ : " + avg);
		
	}

}
