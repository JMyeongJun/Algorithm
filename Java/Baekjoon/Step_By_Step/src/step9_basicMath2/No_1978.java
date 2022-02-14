package step9_basicMath2;

import java.util.Scanner;

public class No_1978 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int cnt = 0;

		for (int i = 0; i < n; i++) {
			if(isPrime(sc.nextInt())) {
				cnt++;
			}
		}

		sc.close();
		System.out.println(cnt);
	}

	private static boolean isPrime(int num) {
		boolean result = false;
		
		for (int i = 2; i <= Math.sqrt((double) num); i++) {
			if (num % i == 0) {
				result = false;
				break;
			}else {
				result = true;
			}
		}
		
		if(num == 2 || num == 3) {
			result = true;
		}

		return result;
	}
}
