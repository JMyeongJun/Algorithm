package step8_basicMath2;

import java.util.Scanner;

/*
 * �ڿ��� M�� N�� �־��� �� M�̻� N������ �ڿ��� �� 
 * �Ҽ��� ���� ��� ��� �̵� �Ҽ��� �հ� �ּڰ��� ã�� ���α׷��� �ۼ��Ͻÿ�.
 * ���� ��� M=60, N=100�� ��� 60�̻� 100������ �ڿ��� ��
 * �Ҽ��� 61, 67, 71, 73, 79, 83, 89, 97 �� 8���� �����Ƿ�, 
 * �̵� �Ҽ��� ���� 620�̰�,
 * �ּڰ��� 61�� �ȴ�.
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
