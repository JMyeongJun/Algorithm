package step2_if;

import java.util.Scanner;

public class No_2525 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 현재 시각 입력(0~23)시 (0~59)분
		int h = sc.nextInt(), n = sc.nextInt();	
		int c = sc.nextInt();	// 필요한 시간 입력(분)
		sc.close();
		
		// 종료 시각 출력
		n += c;
		h += n/60;
		if(h >= 24) {
			h -= 24;
		}
		n = n%60;
		System.out.println(h + " " + n);
		
	}
}
