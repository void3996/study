package sec01.exam02.day4;

public class VariableUseExample {

	public static void main(String[] args) {
		
		int hour = 3;	//변수 hour에 3을 담았다
		int minute = 5;	//변수 minute에 5를 담았다								
		System.out.println(hour + "시간" + minute + "분");	//변수 hour와 minute의 값을 출력
		
		int totalMinute = (hour * 60) + minute;	//변수 hour에 60을 곱한 값과 변수  minute과 합하여 변수 totalMinute에 담았다
		System.out.println("총" + totalMinute + "분");	//변수 totalMinute을 출력
	}

}
