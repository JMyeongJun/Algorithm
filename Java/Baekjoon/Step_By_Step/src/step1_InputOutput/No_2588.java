package step1_InputOutput;

import java.util.Scanner;

public class No_2588 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b, result;

		a = sc.nextInt();
		b = sc.nextInt();

		result = a * b;
		while (b != 0) {
			System.out.println(a * (b % 10));
			b /= 10;
		}

		System.out.println(result);

		sc.close();
	}
}
