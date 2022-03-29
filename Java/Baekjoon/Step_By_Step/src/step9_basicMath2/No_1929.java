package step9_basicMath2;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Scanner;

// M이상 N이하의 소수를 모두 출력하는 프로그램을 작성하시오.
// 에라토스테네스의 체를 이용하여 구해보자!!

public class No_1929 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt(), n = sc.nextInt();
		sc.close();

		LinkedHashMap<Integer, Integer> map = new LinkedHashMap<Integer, Integer>();

		// map 초기화
		for (int i = m; i <= n; i++) {
			if (i == 1) {
				continue;
			}
			map.put(i, i);
		}

		// 소수아닌 값 제거
		for (int i = 2; (i * i) <= n; i++) {
			for (int j = i + 1; j <= n; j++) {
				if (map.get(j) == null) {
					continue;
				}
				if (map.get(j) % i == 0) {
					map.remove(j);
				}
			}
		}

		// 출력
		for(Iterator<Integer> iterator = map.keySet().iterator(); iterator.hasNext();) {
			Integer key = iterator.next();
			System.out.println(map.get(key));
		}
	}
}
