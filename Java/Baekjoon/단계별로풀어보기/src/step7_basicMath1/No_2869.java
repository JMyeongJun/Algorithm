package step7_basicMath1;

import java.util.Scanner;

// v : 달팽이가 올라갈 나무 막대 높이
// a : 낮에 올라갈 수 있는 거리
// b : 밤에 미끄러지는 거리

// 입력)
// 첫째 줄에 세 정수 a, b, v가 공백으로 구분되어서 주어진다 
// (1<=b<a<=v<=1,000,000,000)

// ※정상에 도착한 후에는 미끄러지지 않는다

// 출력)
// 달팽이가 나무 막대를 모두 올라가는데 며칠이 걸리는지 출력

public class No_2869 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(), b = sc.nextInt(), v = sc.nextInt();
		sc.close();

		if (v <= a) {
			System.out.println(1);
		} else {
			v -= a;
			v = (int) Math.ceil(v / (double) (a - b));
//			System.out.println("v : " + v);
			System.out.println(1 + v);
		}

		// 시간초과
//		int pos = 0, day = 1;
//		
//		while(true) {
//			pos += a;
//			if(pos>= v) {
//				System.out.println(day);
//				break;
//			}
//			
//			pos -= b;
//			day++;
//		}

	}
}
