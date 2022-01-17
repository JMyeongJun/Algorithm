package step7_string;

import java.util.Scanner;

public class No_11720 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String numbers = sc.next();
		int sum = 0;

		for (int i = 0; i < n; i++) {
			sum += Character.getNumericValue(numbers.charAt(i));
		}

		System.out.println(sum);
		sc.close();
	}
}
