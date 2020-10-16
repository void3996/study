package sec05.exam04.day85;
//하나의 객체만 만들도록 보장해야 하는 경우가 싱글톤
public class Singleton {
	//정적 필드
	private static Singleton singleton = new Singleton();
	//클래스 외부에서 new 연산자로 생성자를 호출할 수 없도록 막아야 한다
	//생성자
	private Singleton() {}
	//정적 메소드
	static Singleton getInstance() {
		//외부에서 객체를 얻는 유일한 방법은 getInstance 메소드를 호출하는 방법
		//getInstance() 메소드는 단 하나의 객체만 리턴한다
		return singleton;
	}
}
