package sec01.exam04.day6;

public class VariableScopeExample {

	public static void main(String[] args) {
		int v1 = 15;	//���� v1�� 15�� ��Ҵ�
		
		if (v1 > 10) {	//���ǹ� if ���� v1�� 10���� ũ�ٸ�
			int v2;		//���� v2 ����
			v2 = v1 - 10;	//v1(15) - 10�� v2�� ��ƶ�
		}
		//int v3 = v1 + v2 + 5;	v2�� if�� { } block �ȿ��� ����� �����̱� ������ �ܺο��� ������� ���Ѵ�
		
	}

}
