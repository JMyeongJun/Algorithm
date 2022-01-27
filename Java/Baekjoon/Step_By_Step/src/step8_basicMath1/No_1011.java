package step8_basicMath1;

import java.util.Scanner;

public class No_1011 {
	
	// 등차수열의 합, 공차 = 1
	// n(n+1)/2
	static int sum(int num) {
		return num * (num +1) / 2;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		for (int i = 0; i < t; i++) {
			int x = sc.nextInt(), y = sc.nextInt(), k = 1;
			int dist = y - x, cnt = 0;
//			System.out.println("dist = " + dist);
//			System.out.println("---------------");
			
			while(dist != 0) {
				dist -= k;
//				System.out.println("dist - k = " + dist);
				
				if(dist >= sum(k+1)) {
//					System.out.println("k++");
					k++;
				}else if(dist < sum(k)) {
//					System.out.println("k--");
//					System.out.println(cnt);
					k--;
				}else {
//					System.out.println("k+0");
				}
//				System.out.println("k = " + k);
				cnt++;
//				System.out.println("---------------");
			}
			System.out.println(cnt);
		}
		
		sc.close();
	}
}
