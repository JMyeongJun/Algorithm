package step5_array;

import java.util.Scanner;

public class No_8958 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] quiz = new String[sc.nextInt()];

		for (int i = 0; i < quiz.length; i++) {
			quiz[i] = sc.next();
		}

		for (int i = 0; i < quiz.length; i++) {
			int cnt = 0, score = 0;

			for (int j = 0; j < quiz[i].length(); j++) {

				if (quiz[i].charAt(j) == 'O') {
					cnt++;
				} else {
					cnt = 0;
				}

				score += cnt;
			}

			System.out.println(score);
		}

		sc.close();
	}
}
