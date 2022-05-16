package step4_array;

import java.util.Scanner;

public class No_2562 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[9];
		int max = -1, max_index = -1;

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();

			if (arr[i] > max) {
				max = arr[i];
				max_index = i;
			}
		}
		
		System.out.println(max + "\n" + (max_index + 1));
		sc.close();
	}
}
