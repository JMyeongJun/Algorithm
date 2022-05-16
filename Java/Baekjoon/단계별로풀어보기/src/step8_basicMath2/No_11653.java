package step8_basicMath2;

import java.util.Scanner;

// 정수 N이 주어졌을 때, 소인수분해하는 프로그램을 작성하시오.

public class No_11653 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		
		for(int i = 2; n != 1; i++) {
			if(n % i == 0) {
				n /= i;
				System.out.println(i);
				i = 1;
			}
		}
	}
	
}
