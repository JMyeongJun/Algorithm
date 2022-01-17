package step7_string;

import java.util.Scanner;

public class No_1157 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next().toUpperCase();
		int[] alphabet = new int[26];
		int max_index = 0;
		boolean ch = false;

		for (int i = 0; i < str.length(); i++) {
			alphabet[str.charAt(i) - 65]++;
		}

		for(int i = 0; i< alphabet.length; i++) {
			if(alphabet[i] > alphabet[max_index]) {
				max_index = i;
			}
		}
		
		for(int i = max_index+1; i< alphabet.length; i++ ) {
			if(alphabet[i] == alphabet[max_index]) {
				ch = true;
			}
		}
		
		if(ch) {
			System.out.println("?");
		}else {
			System.out.println((char)(max_index+65));
		}
		
		sc.close();
	}
}
