package step7_basicMath1;

import java.util.Scanner;

public class No_2775 {

	// 배열의 0에서 어떤 인덱스까지의 합 구하는 함수
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

			// 0층 배열 채워주기 (n호 까지)
			for (int j = 0; j < apt.length; j++) {
				apt[j] = j + 1;
			}

			// k층 -> k번 반복
			for (int a = 0; a < k; a++) {

				// 배열 마지막 인덱스부터 각 인덱스까지의 배열 요소 합 대입
				for (int j = apt.length - 1; j >= 1; j--) {
					apt[j] = arrsum(apt, j);
				}
			}

			// 배열 가장 마지막 인덱스 출력
			System.out.println(apt[apt.length - 1]);
		}

		sc.close();
	}
}
