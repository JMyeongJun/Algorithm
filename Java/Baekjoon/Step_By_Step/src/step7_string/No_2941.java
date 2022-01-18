package step7_string;

import java.util.Scanner;

public class No_2941 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		sc.close();

		String str1 = str.replaceAll("c=|c-|dz=|d-|lj|nj|s=|z=", "0");

		System.out.println(str1.length());
	}
}
