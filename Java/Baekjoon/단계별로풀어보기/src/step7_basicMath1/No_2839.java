package step7_basicMath1;

import java.util.Scanner;

public class No_2839 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), bags = 0;
		sc.close();

		while (n > 0) {
			if (n % 5 == 0) {
				bags += n / 5;
				break;
			} else {
				n -= 3;
				bags++;

				if (n < 0) {
					bags = -1;
					break;
				}
			}
		}

		System.out.println(bags);
	}
}
