package 한국정보올림피아드.KOI_2019_1차.초등부;

import java.util.Scanner;

public class No_17608 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		int lastHeight = arr[arr.length - 1];
		int cnt = 1;
		
		for (int i = arr.length - 1; i >= 0; i--) {
			if (arr[i] > lastHeight) {
				cnt++;
				lastHeight = arr[i];
			}
		}

		System.out.println(cnt);
		sc.close();
	}
}
