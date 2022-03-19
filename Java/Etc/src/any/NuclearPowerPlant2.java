package any;

import java.util.Scanner;

/*
2
2 3
1 0 0
2 0 9
4 6
0 0 0 0 0 1
0 2 0 0 8 2
1 3 0 2 0 0
0 2 3 1 0 9
*/

public class NuclearPowerPlant2 {
	static int sum = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt(); // 테스트 케이스
		int count = 0;
		int max_sum = 0;
		for (int p = 0; p < T; p++) {
			int N = sc.nextInt();
			int M = sc.nextInt();

			// 입력
			int[][] arr = new int[N][M];
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr[i].length; j++) {
					arr[i][j] = sc.nextInt();
				}
			}
			
			// 찾기
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr[i].length; j++) {
					if (arr[i][j] != 0) {
						sum += arr[i][j];
						arr[i][j] = 0;
						search(arr, i, j);
						count++;
						if (max_sum < sum) {
							max_sum = sum;
						}
						sum = 0;
					}

				}
			}
			
			// 출력
			System.out.println("max_sum = " + max_sum);
			System.out.println("count = " + count);
			
			// 초기화
			count = 0;
		}

		sc.close();
	}
	
	public static int[][] search(int[][] arr, int i, int j) {
		// 오른쪽 탐색
		if (j + 1 < arr[i].length && arr[i][j + 1] != 0) {
			sum += arr[i][j + 1];
			arr[i][j + 1] = 0;
			arr = search(arr, i, j + 1);
		} 
		
		// 아래 탐색
		if (i + 1 < arr.length && arr[i + 1][j] != 0) {
			sum += arr[i + 1][j];
			arr[i + 1][j] = 0;
			arr = search(arr, i + 1, j);
		} 
		
		// 왼쪽 탐색
		if (j - 1 >= 0 && arr[i][j - 1] != 0) {
			sum += arr[i][j - 1];
			arr[i][j - 1] = 0;
			arr = search(arr, i, j - 1);
		}
		
		// 위쪽 탐색
		if (i - 1 >= 0 && arr[i - 1][j] != 0) {
			sum += arr[i - 1][j];
			arr[i - 1][j] = 0;
			arr = search(arr, i - 1, j);
		}

		return arr;
	}
}