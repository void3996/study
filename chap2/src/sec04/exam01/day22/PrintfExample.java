package sec04.exam01.day22;

public class PrintfExample {

	public static void main(String[] args) {
		int value = 123;
		//print(����) : ��ȣ ���� ������ ��¸� �ض�
		//print(����) : ��ȣ ���� ������ ����ϰ� ���� �ٲ��
		//printf("���Ĺ��ڿ�", ��1, ��2, ...) : ��ȣ ���� ù���� ���ڿ� ���Ĵ�� ������ ����ض�
		//%d : ����
		//%6d 6�ڸ� ����. ���� ���ڸ� ����
		//%-6 6�ڸ� ����. ������ ���ڸ� ����
		//%06d 6�ڸ� ����. ���� ���ڸ� 0���� ä��
		//%10.2f �Ҽ��� �̻� 7�ڸ�, �Ҽ��� ���� 2�ڸ�. ���� ���ڸ� ����
		//%-10.2f �Ҽ��� �̻� 7�ڸ�, �Ҽ��� ���� 2�ڸ�. ������ ���ڸ� ����
		//%010.2f �Ҽ��� �̻� 7�ڸ�, �Ҽ��� ���� 2�ڸ�. ���� ���ڸ� 0 ä��
		//%s ���ڿ�
		//%6s 6�ڸ� ���ڿ�. ���� ���ڸ� ����
		//%6s 6�ڸ� ���ڿ�. ������ ���ڸ� ����
		// \t tab
		// \n �ٹٲ�
		// %% %
		
		System.out.printf("��ǰ�� ����:%d��\n", value);
		System.out.printf("��ǰ�� ����:%6d��\n", value);
		System.out.printf("��ǰ�� ����:%-6d��\n", value);
		System.out.printf("��ǰ�� ����:%06d��\n", value);
		System.out.printf("��ǰ�� ����:%d��\n", value);
		
		double area = 3.14159 * 10 * 10;
		System.out.printf("�������� %d�� ���� ����:%10.2f\n", 10, area);
		
		String name = "ȫ�浿";
		String job = "����";
		System.out.printf("%6d | %-10s | %10s\n", 1, name, job);

	}

}
