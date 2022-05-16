package step8_basicMath2;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Scanner;

// M�̻� N������ �Ҽ��� ��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
// �����佺�׳׽��� ü�� �̿��Ͽ� ���غ���!!

public class No_1929 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt(), n = sc.nextInt();
		sc.close();

//		LinkedHashMap<Integer, Integer> map = new LinkedHashMap<Integer, Integer>();
//
//		// map �ʱ�ȭ
//		for (int i = m; i <= n; i++) {
//			if (i == 1) {
//				continue;
//			}
//			map.put(i, i);
//		}
//
//		// �Ҽ��ƴ� �� ����
//		for (int i = 2; (i * i) <= n; i++) {
//			if (map.get(i) == null) {
//				continue;
//			}
//			for (int j = i * i; j <= n; j += i) {
//				if (map.get(j) == null) {
//					continue;
//				}
//				map.remove(j);
//			}
//		}
//
//		// ���
//		for (Iterator<Integer> iterator = map.keySet().iterator(); iterator.hasNext();) {
//			Integer key = iterator.next();
//			System.out.println(map.get(key));
//		}
		
		int[] arr = new int[n + 1];
		
		for(int i = 2; (i * i) <= n; i++) {
			if(arr[i] != 0) {
				for(int j = i * i; j <= n; j += i) {
					arr[j] = 0;
				}
			}
		}
		
		for(int i = m; i <= n; i++) {
				System.out.println(arr[i]);
		}
		
	}
}
