package step8_basicMath2;

import java.util.Scanner;

// ���� N�� �־����� ��, ���μ������ϴ� ���α׷��� �ۼ��Ͻÿ�.

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
