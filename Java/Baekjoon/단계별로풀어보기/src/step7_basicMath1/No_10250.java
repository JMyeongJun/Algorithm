package step7_basicMath1;

import java.util.Scanner;

// �������κ��� �ȴ� �Ÿ��� ���� ª���� ���� �����ϴ� ���α׷�

// �� ���� W ���� ���� �ִ� H �� �ǹ��̶�� ���� (1 �� H, W �� 99)
// ��� ������ �� �� ������ �Ÿ��� ���� �Ÿ�(�Ÿ� 1)

// �� ��ȣ�� YXX �� YYXX �����ε� ���⼭ Y �� YY �� �� ���� ��Ÿ����
// XX �� ���������Ϳ������� ������ ���� ��ȣ�� ��Ÿ����

// ���������͸� Ÿ�� �̵��ϴ� �Ÿ��� �Ű� ���� �ʴ´�
// �ٸ� �ȴ� �Ÿ��� ���� ������ �Ʒ����� ���� �� ��ȣ

// N ��°�� ������ �մԿ��� ������ �� ��ȣ�� ���

public class No_10250 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt(); 	// �׽�Ʈ ���̽�

		for (int i = 1; i <= t; i++) {
			int h = sc.nextInt();
			sc.nextInt();	// W�� �ʿ����...
			int n = sc.nextInt();
			
			System.out.printf("%d%02d\n", n%h == 0? h : n%h,
										  n%h == 0? n/h : n/h+1);
		}
		
		sc.close();
	}
}
