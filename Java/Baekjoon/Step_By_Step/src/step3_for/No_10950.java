package step3_for;

import java.util.Scanner;

public class No_10950 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t, a, b;

		t = sc.nextInt();
		for (int i = 0; i < t; i++) {
			a = sc.nextInt();
			b = sc.nextInt();

			System.out.println(a + b);
		}

		sc.close();
	}
}
