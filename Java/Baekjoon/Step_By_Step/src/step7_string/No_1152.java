package step7_string;

import java.util.Scanner;

public class No_1152 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int cnt = 0;
		
		for(int i =1; i< str.length()-1; i++) {
			if(str.charAt(i) == ' ') {
				cnt++;
			}
		}
		
		if(str.trim().equals("")) {
			System.out.println(cnt);
		}else {
			System.out.println(cnt+1);
		}
		
		sc.close();
	}
}
