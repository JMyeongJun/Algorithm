package any;

import java.util.Scanner;

/* 원전 문제
 * 가로 N 세로 M 크기의 원전이있다.
 * 각 숫자는 원전의 양이다
 * 연결되어있는 원전은 (0이상의 숫자들) 한번의 시추로 모두 획득 가능하다.
 * 총 몇번의 시추작업이 있어야하는지와 한번의 시추로 얻을수 있는 원전의양중 가장 큰값을 출력하는 프로그램을 작성하라
 * 
 * 첫번째 줄에는 테스트케이스 갯수(T)를 입력받는다.
 * 두번째 줄에는 원전의 가로세로 N,M을 입력 받는다.
 * 다음은 각각 원전의 양을 한칸씩 띄워 입력받는다.
 * 
 *  예)
 *  -입력
2
2 3
1 0 0
2 0 9
4 6
0 0 0 0 0 1
0 2 0 0 8 2
1 3 0 2 0 0
0 2 3 1 0 9
 *  
 *  -출력
 *  #1 2 9
 *  #2 3 14
 * */

public class NuclearPowerPlant {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt(); // 테스트케이스 입력
		for (int i = 0; i < t; i++) { // 테스트케이스 만큼 반복

			// 원전 크기 입력
			int n = sc.nextInt(), m = sc.nextInt();

			// 원전 양 입력
			int[][] plant = new int[n][m];
			for (int j = 0; j < n; j++) {
				for (int k = 0; k < m; k++) {
					plant[j][k] = sc.nextInt();
				}
			}

			int max = 0, cnt = 0;
			while (findNumber(plant) != null) {
				int[] ind = findNumber(plant);
				max = Math.max(max, findPath(plant, ind[0], ind[1]));
				cnt++;
				
				// debuging code
//				int path = findPath(plant, ind[0], ind[1]);
//				System.out.println(path);
//				max = Math.max(max, path);
//				for (int z = 0; z < plant.length; z++) {
//					System.out.println(Arrays.toString(plant[z]));
//				}
				
			}
			System.out.printf("#%d %d %d\n", i + 1, cnt, max);
		}
		sc.close();
	}

	public static int[] findNumber(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] != 0) {
					return new int[] { i, j };
				}
			}
		}
		return null;
	}

	public static int findPath(int[][] arr, int ind1, int ind2) {
		int ret = 0;

		if (arr[ind1][ind2] != 0) {
			ret += arr[ind1][ind2];
			arr[ind1][ind2] = 0;

			if (ind2 != arr[ind1].length - 1) { // 오른쪽
				ret += findPath(arr, ind1, ++ind2);
				ind2--;
			}
			if (ind1 != arr.length - 1) { // 아래
				ret += findPath(arr, ++ind1, ind2);
				ind1--;
			}
			if (ind2 != 0) { // 왼쪽
				ret += findPath(arr, ind1, --ind2);
				ind2++;
			}
			if (ind1 != 0) { // 위쪽
				ret += findPath(arr, --ind1, ind2);
				ind1++;
			}

		}

		return ret;
	}

}
