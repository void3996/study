package sec02.exam07.day62;

public class ArrayInArrayExample {

	public static void main(String[] args) {
		//다차원 배열
		int[][] mathScores = new int[2][3];	//2 X 3 행렬의 구조
											//	ㅁㅁㅁ	(0, 0) (0, 1) (0, 2)
											//	ㅁㅁㅁ	(1, 0) (1, 1) (1, 2)
		for (int i = 0; i < mathScores.length; i++) {
			for (int j = 0; j < mathScores[i].length; j++) {
				System.out.println("mathScores["+i+"]["+j+"]="+mathScores[i][j]);
			}
		}
		System.out.println();
		
		int[][] englishScores = new int[2][];
		englishScores[0] = new int[2];
		englishScores[1] = new int[3];
		for (int i = 0; i < englishScores.length; i++) {
			for (int j = 0; j < englishScores[i].length; j++) {
				System.out.println("englishScores["+i+"]["+j+"]="+englishScores[i][j]);
			}
		}
		System.out.println();
		
		int[][] javaScores = {{95, 80}, {92, 96, 80}};
		for (int i = 0; i < javaScores.length; i++) {
			for (int j = 0; j < javaScores[i].length; j++) {
				System.out.println("javaScores["+i+"]["+j+"]="+javaScores[i][j]);
			}
			
		}
	}

}
