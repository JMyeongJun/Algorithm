package step8_basicMath1;

import java.util.Scanner;

public class No_1712 {
	// A : ���� ���, B : ���� ���, C : �Ǹ� ���� (21������ �ڿ���)
	// ���ͺб���(break-even point)? --> �Ǹ� ���� > ���� ���

	// ���� ��� : A + B*�Ǹŷ�(P)
	// �Ǹ� ���� : C*�Ǹŷ�(P)

	// ==> C*P > A + B*P �϶� P�� ���ͺб��� �Ǹŷ�
	// ==> C*P - B*P > A
	// ==> (C-B)*P > A
	// ==> P > A/(C-B)

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
		sc.close();

		System.out.println(bep(a, b, c));
	}

	static int bep(int a, int b, int c) {
		if (b >= c) {
			return -1;
		} else {
			return a / (c - b) + 1;
		}
	}
}
