package step5_array;

import java.util.Scanner;

public class No_10818 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), max = -10000000, min = 10000000;
		int[] arr = new int[n];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();

			max = arr[i] > max ? arr[i] : max;
			min = arr[i] < min ? arr[i] : min;
		}

		System.out.println(min + " " + max);

		sc.close();
	}
}
