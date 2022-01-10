package step2_if;

import java.util.Scanner;

public class No_2884 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h, m, t;

		h = sc.nextInt();
		m = sc.nextInt();

		t = h * 60 + m - 45;
		if (t < 0) {
			t += 24 * 60;
		}

		System.out.println(t / 60 + " " + t % 60);
		sc.close();
	}
}
