package step9_recursion;

import java.util.Scanner;

public class No_10872 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(factorial(sc.nextInt()));
		sc.close();
	}

	private static int factorial(int n) {
		return n > 0? n * factorial(n-1) : 1;
	}
}
