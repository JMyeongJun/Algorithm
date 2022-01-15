package step4_while;

import java.util.Scanner;

// EOF(End of File)란? 
// 이 문제에서 가장 중요한 점이 파일 종료 조건이 없이 그냥 입력이 주어졌다는 것이다.
// 즉, 입력에서 더이상의 읽을 수 있는 데이터가 존재하지 않을 때 반복문을 종료하라는 것이다.

// 개수를 모르므로 for문 보다는 while문을 이용한다.

// -EOF처리 : 새롭게 라인을 읽어왔는데 그 값이 null이면 더 이상 읽을 것이 없다는 의미이므로 루프를 끝내면 된다.
// ## 자바에서 커맨드라인을 이용해 입력값을 주는 경우, CTRL+Z를 누른 뒤 엔터키를 누르면 입력이 끝난 것으로 처리된다.

public class No_10951 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b;

		while (sc.hasNext()) {
			a = sc.nextInt();
			b = sc.nextInt();

			System.out.println(a + b);
		}
		
		sc.close();
	}
}
