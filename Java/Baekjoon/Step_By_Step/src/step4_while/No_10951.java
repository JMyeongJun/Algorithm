package step4_while;

import java.util.Scanner;

// EOF(End of File)��? 
// �� �������� ���� �߿��� ���� ���� ���� ������ ���� �׳� �Է��� �־����ٴ� ���̴�.
// ��, �Է¿��� ���̻��� ���� �� �ִ� �����Ͱ� �������� ���� �� �ݺ����� �����϶�� ���̴�.

// ������ �𸣹Ƿ� for�� ���ٴ� while���� �̿��Ѵ�.

// -EOFó�� : ���Ӱ� ������ �о�Դµ� �� ���� null�̸� �� �̻� ���� ���� ���ٴ� �ǹ��̹Ƿ� ������ ������ �ȴ�.
// ## �ڹٿ��� Ŀ�ǵ������ �̿��� �Է°��� �ִ� ���, CTRL+Z�� ���� �� ����Ű�� ������ �Է��� ���� ������ ó���ȴ�.

public class No_10951 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b;

		while (sc.hasNext()) {
			a = sc.nextInt();
			b = sc.nextInt();

			System.out.println(a + b);
		}
		
		sc.close();
	}
}
