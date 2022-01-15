package step5_array;

import java.util.Scanner;

public class No_2577 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] result = new int[10];
		int a = sc.nextInt();
		a *= sc.nextInt();
		a *= sc.nextInt();

		while (a != 0) {
			result[a % 10]++;
			a /= 10;
		}

		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}

		sc.close();
	}
}
