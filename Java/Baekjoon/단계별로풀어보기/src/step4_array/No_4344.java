package step4_array;

import java.util.Scanner;

public class No_4344 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int c = sc.nextInt();

		for (int i = 0; i < c; i++) {
			int n = sc.nextInt(), sum = 0, cnt = 0;
			int[] arr = new int[n];

			for (int j = 0; j < n; j++) {
				arr[j] = sc.nextInt();
				sum += arr[j];
			}

			sum /= n;
			
			for (int j = 0; j < n; j++) {
				if (arr[j] > sum) {
					cnt++;
				}
			}

			System.out.printf("%.3f%%\n", cnt / (double) n * 100);
		}

		sc.close();
	}
}
