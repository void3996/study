package sec02.exam10.day66;

public class AdvancedForExample {

	public static void main(String[] args) {
		int[] scores = {95, 71, 84, 93, 87};
		
		int sum=0;
		for (int i : scores) {
			sum = sum + i;
		}
		
//		for (2 타입변수 : 1 배열) {	개선된 for문이 처음 실행될 때 배열(1) 에서 가져올 첫번째 값이 존재하는지 평가
//			3 실행문;	 가져올 값이 존재하면 변수(2)에 저장
//					 실행문(3)을 실행
//					 블록 내부 실행문(3) 이 실행되면 다시 루프를 돌아 배열(1)에서 가져올 다음값이 존재하는지 평가
//					 다음 항목이 존재하면 2->3->1 순서로 루프를 다시 진행하고 가져올 다음항목이 없으면 for문 종료
//		}
		System.out.println("점수 총합 = " + sum);
		
		double avg = (double) sum / scores.length;
		System.out.println("점수 평균 = " + avg);
	}

}
