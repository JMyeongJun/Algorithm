package step7_basicMath1;

import java.util.Scanner;

// 정문으로부터 걷는 거리가 가장 짧도록 방을 배정하는 프로그램

// 각 층에 W 개의 방이 있는 H 층 건물이라고 가정 (1 ≤ H, W ≤ 99)
// 모든 인접한 두 방 사이의 거리는 같은 거리(거리 1)

// 방 번호는 YXX 나 YYXX 형태인데 여기서 Y 나 YY 는 층 수를 나타내고
// XX 는 엘리베이터에서부터 세었을 때의 번호를 나타낸다

// 엘리베이터를 타고 이동하는 거리는 신경 쓰지 않는다
// 다만 걷는 거리가 같을 때에는 아래층의 방을 더 선호

// N 번째로 도착한 손님에게 배정될 방 번호를 계산

public class No_10250 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt(); 	// 테스트 케이스

		for (int i = 1; i <= t; i++) {
			int h = sc.nextInt();
			sc.nextInt();	// W는 필요없음...
			int n = sc.nextInt();
			
			System.out.printf("%d%02d\n", n%h == 0? h : n%h,
										  n%h == 0? n/h : n/h+1);
		}
		
		sc.close();
	}
}
