package sec05.exam04.day85;
//�ϳ��� ��ü�� ���鵵�� �����ؾ� �ϴ� ��찡 �̱���
public class Singleton {
	//���� �ʵ�
	private static Singleton singleton = new Singleton();
	//Ŭ���� �ܺο��� new �����ڷ� �����ڸ� ȣ���� �� ������ ���ƾ� �Ѵ�
	//������
	private Singleton() {}
	//���� �޼ҵ�
	static Singleton getInstance() {
		//�ܺο��� ��ü�� ��� ������ ����� getInstance �޼ҵ带 ȣ���ϴ� ���
		//getInstance() �޼ҵ�� �� �ϳ��� ��ü�� �����Ѵ�
		return singleton;
	}
}
