package step3_loop;

import java.util.Scanner;

public class No_11022 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int[] a = new int[t];
		int[] b = new int[t];

		for (int i = 1; i <= t; i++) {
			a[i - 1] = sc.nextInt();
			b[i - 1] = sc.nextInt();
		}

		for (int i = 0; i < t; i++) {
			System.out.printf("Case #%d: %d + %d = %d\n", i + 1, a[i], b[i], a[i] + b[i]);
		}

		sc.close();
	}
}
