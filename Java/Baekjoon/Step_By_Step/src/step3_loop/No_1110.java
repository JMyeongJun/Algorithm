package step3_loop;

import java.util.Scanner;

public class No_1110 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, temp, cnt = 0;
		
		n = sc.nextInt();
		temp = n;
		
		while (true) {
			n = (n % 10) * 10 + (n / 10 + n % 10) % 10;
			cnt++;
			
			if (n == temp) {
				break;
			}
		}
		System.out.println(cnt);
		sc.close();
	}
}
