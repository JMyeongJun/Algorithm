package step6_string;

import java.util.Scanner;

public class No_2908 {
	static int reverse(int n) {
		String str = "";
		
		while (n != 0) {
			str += n % 10;
			n /= 10;
		}

		return Integer.parseInt(str);
		
//		int num = 0;
//		
//		while (n != 0) {
//			num = num * 10 + n % 10;
//			n /= 10;
//		}
//		
//		return num;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = reverse(sc.nextInt()), b = reverse(sc.nextInt());

		if (a > b) {
			System.out.println(a);
		} else {
			System.out.println(b);
		}

		sc.close();
	}
}
