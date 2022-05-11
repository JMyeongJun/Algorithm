package step6_string;

import java.util.Arrays;
import java.util.Scanner;

public class No_10809 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int[] result = new int[26];

		Arrays.fill(result, -1);

		for (int i = 0; i < str.length(); i++) {

			if (result[(int) str.charAt(i) - 97] == -1) {
				result[(int) str.charAt(i) - 97] = i;
			}
		}

		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i] + " ");
		}

		sc.close();
	}
}
