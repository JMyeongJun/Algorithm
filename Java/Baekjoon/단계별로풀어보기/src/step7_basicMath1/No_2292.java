package step7_basicMath1;

import java.util.Scanner;

public class No_2292 {
	// 1,2~7,8~19,20~37,38~61,62~91
	//	6	12	 18	   24	30
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int num = 1, i = 1;
		sc.close();
		
		while(true) {
			
			if(n <= num) {
				System.out.println(i);
				break;
			}
			
			num += 6 * i++;
		}
	}
}
