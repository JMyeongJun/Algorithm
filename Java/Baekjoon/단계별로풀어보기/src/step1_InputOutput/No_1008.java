package step1_InputOutput;

import java.util.Scanner;

public class No_1008 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b;

		a = sc.nextInt();
		b = sc.nextInt();

		System.out.println(a / (double)b);
		sc.close();
	}
}
