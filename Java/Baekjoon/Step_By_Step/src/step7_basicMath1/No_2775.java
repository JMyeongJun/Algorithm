package step7_basicMath1;

import java.util.Scanner;

public class No_2775 {

	// �迭�� 0���� � �ε��������� �� ���ϴ� �Լ�
	static int arrsum(int[] arr, int index) {
		int sum = 0;
		for (int i = 0; i <= index; i++) {
			sum += arr[i];
		}

		return sum;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		for (int i = 0; i < t; i++) {
			int k = sc.nextInt(), n = sc.nextInt();
			int[] apt = new int[n];

			// 0�� �迭 ä���ֱ� (nȣ ����)
			for (int j = 0; j < apt.length; j++) {
				apt[j] = j + 1;
			}

			// k�� -> k�� �ݺ�
			for (int a = 0; a < k; a++) {

				// �迭 ������ �ε������� �� �ε��������� �迭 ��� �� ����
				for (int j = apt.length - 1; j >= 1; j--) {
					apt[j] = arrsum(apt, j);
				}
			}

			// �迭 ���� ������ �ε��� ���
			System.out.println(apt[apt.length - 1]);
		}

		sc.close();
	}
}
