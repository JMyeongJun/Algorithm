package step8_basicMath2;

import java.util.Scanner;

/*
 * 자연수 M과 N이 주어질 때 M이상 N이하의 자연수 중 
 * 소수인 것을 모두 골라 이들 소수의 합과 최솟값을 찾는 프로그램을 작성하시오.
 * 예를 들어 M=60, N=100인 경우 60이상 100이하의 자연수 중
 * 소수는 61, 67, 71, 73, 79, 83, 89, 97 총 8개가 있으므로, 
 * 이들 소수의 합은 620이고,
 * 최솟값은 61이 된다.
 */

public class No_2581 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int m = sc.nextInt(), n = sc.nextInt();
		sc.close();
		
		int min = -1, sum = 0;
		
		for(int i = m; i <= n; i++) {
			if(isPrime(i)) {
				if(min == -1) {
					min = i;
				}
				sum += i;
			}
		}
		
		if(min == -1) {
			System.out.println(min);
		}else {
			System.out.println(sum);
			System.out.println(min);
		}
		
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
