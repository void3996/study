package sec06.exam05.package1.day92;
//�ʵ�� �޼ҵ��� ���� ����
public class A {
	//�ʵ�
	public int field1;	//public ���� ����
	int field2;			//default ���� ����
	private int field3; //private ���� ����
	
	//������
	public A() {
		field1 = 1;
		field2 = 1;
		field3 = 1;
		
		method1();
		method2();
		method3();
		//Ŭ���� ������ ��� ���� �������� ������ ���� ����
	}
	
	//�޼ҵ�
	public void method1() {}	//public ���� ����
	void method2() {}			//default ���� ����
	private void method3() {	//private ���� ����
	}
}
