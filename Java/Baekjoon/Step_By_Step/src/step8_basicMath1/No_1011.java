package step8_basicMath1;

import java.util.Scanner;

public class No_1011 {
	
	// 등차수열의 합, 공차 = 1
	// n(n+1)/2
	static int sum(int num) {
		return num * (num +1) / 2;
	}
	
	public static void main(String[] args) throws InterruptedException {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		for (int i = 0; i < t; i++) {
			int x = sc.nextInt(), y = sc.nextInt(), k = 1;
			int dist = y - x, cnt = 0;
			System.out.println("dist : " + dist);
			
			while(dist != 0) {
				dist -= k;
				cnt++;
				
				if(dist >= sum(k+1)) {
					k++;
				}else if(dist < sum(k)) {
					k--;
				}
			}
			
			System.out.println(cnt);
		}
		
		sc.close();
	}
}
