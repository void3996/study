package sec04.exam03.day78;

public class Car {
	//�ʵ�
	int gas;
	//������
	
	//�޼ҵ�
	//���ϰ��� ���� �޼ҵ�� �Ű����� �޾Ƽ� gas �ʵ尪�� ����
	void setGas(int gas) {
		this.gas = gas;
	}
	
	boolean isLeftGas() {
		if (gas == 0) {
			System.out.println("gas�� �����ϴ�.");
			return false; //false�� ����
		}
		System.out.println("gas�� �ֽ��ϴ�.");
		return true;	//true�� ����
	}
	//���ϰ��� ���� �޼ҵ�� gas �ʵ尪�� 0�̸� return������ �޼ҵ带 ��������
	void run() {
		while (true) {
			if(gas > 0) {
				System.out.println("�޸��ϴ�.(gas�ܷ�:" + gas + ")");
				gas -= 1;
			}else {
				System.out.println("����ϴ�.(gas�ܷ�:" + gas + ")");
				return; //�޼ҵ� ��������
			}
			
		}
	}
}
