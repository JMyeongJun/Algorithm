package step_2;

import java.util.Scanner;

public class No_2753 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, result;

		a = sc.nextInt();

		result = (a%4==0)&&(a%100!=0)||(a%400==0) ? 1 : 0;
		System.out.println(result);

		sc.close();
	}
}
