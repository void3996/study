package sec06.exam06.day93;
//Getter�� Setter �޼ҵ� ���
public class CarExample {

	public static void main(String[] args) {
		Car myCar = new Car();
		
		//�߸��� �ӵ� ����
		myCar.setSpeed(-50);
		
		System.out.println("���� �ӵ�: " + myCar.getSpeed());
		//�߸��� �ӵ� ���� �õ������� speed �ʵ��� Setter(setSpeed()) ���� �Ű����� �˻��� �� 0���� �����ϱ� ������
		//10������ Getter(getSpeed())�� ���ϰ��� 0���� ���´�
		//�ùٸ� �ӵ� ����
		myCar.setSpeed(60);
		
		//����
		if (myCar.isStop()) {
			myCar.setStop(true);
		//stop �ʵ��� Getter(isStop()) ���� ���� false�� ���, �ڵ����� ���߱� ���� Setter(setStop(true))��
			//ȣ���ؼ� stop �ʵ带 true��, speed �ʵ带 0���� �����Ѵ�
		}
		
		System.out.println("���� �ӵ� : " + myCar.getSpeed());
	}

}
