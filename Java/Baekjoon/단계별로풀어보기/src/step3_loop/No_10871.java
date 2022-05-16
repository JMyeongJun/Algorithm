package step3_loop;

import java.util.Scanner;

public class No_10871 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), x = sc.nextInt();
		int[] a = new int[n];

		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}

		for (int i = 0; i < n; i++) {
			if (a[i] < x) {
				System.out.print(a[i] + " ");
			}
		}

		sc.close();
	}
}
