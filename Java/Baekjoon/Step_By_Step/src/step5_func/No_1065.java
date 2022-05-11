package step5_func;

import java.util.Scanner;

public class No_1065 {

	public static boolean hansu(int num) {
		String n = Integer.toString(num);
		int diff1, diff2;

		if (num < 100) {
			return true;
		}

		for (int i = 0; i < n.length() - 2; i++) {

			diff1 = Integer.parseInt(String.valueOf(n.charAt(i))) 
					- Integer.parseInt(String.valueOf(n.charAt(i + 1)));
			diff2 = Integer.parseInt(String.valueOf(n.charAt(i + 1)))
					- Integer.parseInt(String.valueOf(n.charAt(i + 2)));

			if (diff1 != diff2) {
				return false;
			}
		}

		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), cnt = 0;

		for (int i = 1; i <= n; i++) {
			if (hansu(i)) {
				cnt++;
			}
		}

		System.out.println(cnt);

		sc.close();
	}
}
