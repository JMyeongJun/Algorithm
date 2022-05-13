package step9_recursion;

import java.util.Scanner;

public class No_10870 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(fibonacci(sc.nextInt()));
		sc.close();
	}

	public static int fibonacci(int n) {
		return n > 1 ? fibonacci(n - 1) + fibonacci(n - 2) : (n == 0) ? 0 : 1;
	}
}
