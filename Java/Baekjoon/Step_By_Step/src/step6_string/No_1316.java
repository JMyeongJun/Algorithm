package step6_string;

import java.util.Scanner;

public class No_1316 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), cnt = 0;
		String[] str = new String[n];

		for (int i = 0; i < str.length; i++) {
			str[i] = sc.next();
			boolean[] chk = new boolean[26];
			int prev = str[i].charAt(0) - 'a';
			
			for(int j = 0; j < str[i].length(); j++) {
				int current = str[i].charAt(j) - 'a';
				
				if(current != prev && chk[current]) {
					cnt++;
					break;
				}else {
					chk[current] = true;
				}
				
				prev = current;
			}
		}
		
		System.out.println(n - cnt);
		sc.close();
	}
}
