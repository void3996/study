package sec01.exam01.day38;

public class IfExample {

	public static void main(String[] args) {
		int score = 93;
		
		if(score>=90) {
			System.out.println("점수가 90보다 큽니다.");
			System.out.println("등급은 A입니다.");
		}
		
		if (score<90) 
			System.out.println("점수가 90보다 작습니다.");	//중괄호가 없다면 여기까지만 if문 영향 아래 있다
			System.out.println("등급은 B입니다.");
		

	}

}
