package sec02.exam09.day65;

public class ArrayCopyExample {

	public static void main(String[] args) {
	//	System.arraycopy(src, srcPos, dest, destPos, length);
	//  System.arraycopy(����, ���� �ε���, ���迭, ������ �ε���, ������ ����);
		String[] oldStrArray = {"java", "array", "copy"};
		String[] newStrArray = new String[5];
		
		System.arraycopy(oldStrArray, 0, newStrArray, 0, oldStrArray.length);
		
		for (int i = 0; i < newStrArray.length; i++) {
			System.out.print(newStrArray[i] + ", ");
			//���� Ÿ�� �迭�� ����Ǹ� ����Ǵ� ���� ��ü�� �����̹Ƿ� �� �迭�� �׸���
			//���� �迭�� �׸��� �����ϴ� ��ü�� �����ϴ�
		}
	}

}
