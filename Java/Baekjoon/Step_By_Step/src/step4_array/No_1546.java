package step4_array;

import java.util.Scanner;

public class No_1546 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] scores = new int[n];
		int max = -1;
		double sum = 0;

		for (int i = 0; i < scores.length; i++) {
			scores[i] = sc.nextInt();
			sum += scores[i];

			max = scores[i] > max ? scores[i] : max;
		}

		sum = sum / max * 100;

		System.out.println(sum / n);

		sc.close();
	}
}
