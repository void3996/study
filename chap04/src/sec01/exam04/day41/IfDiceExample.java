package sec01.exam04.day41;

public class IfDiceExample {

	public static void main(String[] args) {
		int num = (int)(Math.random() * 6) + 1; //�ֻ��� ��ȣ �ϳ� �̱�
						//(0~5 ������ �ϳ��� ����) + 1
						//Math.random method�� 0.0�� 1.0 ���̿� ���ϴ� double Ÿ���� ���� �ϳ��� �����Ѵ�
						//0.0�� ������ ���Եǰ� 1.0�� ���Ե��� �ʴ´�
		
		if(num==1) {
			System.out.println("1���� ���Խ��ϴ�.");
		}else if (num==2) {
			System.out.println("2���� ���Խ��ϴ�.");
		}else if (num==3) {
			System.out.println("3���� ���Խ��ϴ�.");
		}else if (num==4) {
			System.out.println("4���� ���Խ��ϴ�.");
		}else if (num==5) {
			System.out.println("5���� ���Խ��ϴ�.");
		}else {
			System.out.println("6���� ���Խ��ϴ�.");
		}
	}

}
