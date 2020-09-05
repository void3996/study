package sec02.exam11.day37;

public class ConditionalOperationExample {

	public static void main(String[] args) {
		int score = 85;
		//삼항연산자 	(조건식, 피연산자1) ? '피연산자2' : (피연산자3(조건식, 피연산자1) ? '피연산자2' : '피연산자3')
		char grade = (score > 90) ? 'A' : ((score > 80) ? 'B' : 'C');
		// score가 90보다 크면 true이면 결과는 'A'이다 false이면 다음 조건 score가 80보다 크면 'B'이다. false면 결과는 'C'이다.
		//char grade;
//		if(score > 90) {
//			grade = 'A';
//		}else if (score > 80) {
//			grade = 'B';
//		}else {
//			grade = 'C';
//		}
		
		System.out.println(score + "점은 " + grade +"등급입니다.");
		
		

	}

}
