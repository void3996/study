package sec02.exam08.day64;

public class ArrayCopyByForExample {

	public static void main(String[] args) {
		//�迭�� �� �� �����ϸ� ũ�⸦ ������ �� ���� ������ �� ���� ���� ������ �ʿ��ϴٸ�
		//�� ū �迭�� ���� ����� ���� �迭�κ��� �׸� ������ �����ؾ� �Ѵ�
		//�迭 ���� �׸� ������ �����Ϸ��� for���� ����ϰų� System.arraycopy() method ����Ѵ�
		int[] oldIntArray = {1, 2, 3};
		int[] newIntArray = new int[5];
		
		for (int i = 0; i < oldIntArray.length; i++) {
			newIntArray[i] = oldIntArray[i];
		}
		
		for (int i = 0; i < newIntArray.length; i++) {
			System.out.print(newIntArray[i] + ", ");
		}
	}

}
