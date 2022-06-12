package 한국정보올림피아드.KOI_2019_1차.초등부;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No_17609 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < t; i++) {
			String str = br.readLine();
			char[] charr = str.toCharArray();
			System.out.println(palindrome(charr));
		}
	}
	
	public static int palindrome(char[] charr) {
		return 0;
	}
}
