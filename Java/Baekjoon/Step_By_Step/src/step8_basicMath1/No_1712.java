package step8_basicMath1;

import java.util.Scanner;

public class No_1712 {
	// A : 고정 비용, B : 가변 비용, C : 판매 가격 (21억이하 자연수)
	// 손익분기점(break-even point)? --> 판매 수입 > 생산 비용

	// 생산 비용 : A + B*판매량(P)
	// 판매 수입 : C*판매량(P)

	// ==> C*P > A + B*P 일때 P가 손익분기점 판매량
	// ==> C*P - B*P > A
	// ==> (C-B)*P > A
	// ==> P > A/(C-B)

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
		sc.close();

		System.out.println(bep(a, b, c));
	}

	static int bep(int a, int b, int c) {
		if (b >= c) {
			return -1;
		} else {
			return a / (c - b) + 1;
		}
	}
}
