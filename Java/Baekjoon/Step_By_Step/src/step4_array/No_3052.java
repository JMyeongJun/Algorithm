package step4_array;

import java.util.Scanner;

public class No_3052 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];
		int cnt = 0;

		for (int i = 0; i < arr.length; i++) {
			boolean isEqual = false;
			
			arr[i] = sc.nextInt() % 42;
			
			for (int j = 0; j < i; j++) {
				if (arr[i] == arr[j]) {
					isEqual = true;
					break;
				}
			}
			
			if(!isEqual) {
				cnt++;
			}
		}
		
		System.out.println(cnt);
		sc.close();
	}
}
