package step3_loop;

import java.util.Scanner;

public class No_11021 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		for (int i = 1; i <= t; i++) {
			int a, b;
			a = sc.nextInt();
			b = sc.nextInt();
			
			System.out.println("Case #" + i + ": " + (a+b));
		}
		
		sc.close();
	}
}
