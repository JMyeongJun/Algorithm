package step7_string;

import java.util.Arrays;
import java.util.Scanner;

public class No_5622 {
	public static void main(String[] args) {
		String[] dial = new String[8];
		int A = (int) 'A'; // A = 65
		Arrays.fill(dial, "");

		for (int i = 0; i < dial.length; i++) { // dial 배열에 알파벳 채우기

			for (int j = 0; j < 3; j++) {
				dial[i] += (char) A;
				A++;
				if (A == 'S' || A == 'Z') {
					j--;
				}
			}
		}

		Scanner sc = new Scanner(System.in);
		String str = sc.next(); // 알파벳 대문자로 이루어진 단어 입력
		sc.close();

		int result = 0;
		for (int i = 0; i < str.length(); i++) {

			for (int j = 0; j < dial.length; j++) {
				if (dial[j].contains(String.valueOf(str.charAt(i)))) {
					result += j + 3;
					break;
				}
			}
		}

		System.out.println(result);
	}
}
