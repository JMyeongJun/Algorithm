package sort;

import main.Util;

public class BubbleSort {
	/*
	 * 1번째와 2번째 원소를 비교하여 정렬하고, 2번째와 3번째, ..., 
	 * n-1번째와 n번째를 정렬한 뒤 다시 처음으로 돌아가 이번에는 n-2번째와 n-1번째까지, 
	 * ...해서 최대 n(n−1)/2번 정렬한다.
	 * 
	 * 한 번 돌 때마다 마지막 하나가 정렬되므로 원소들이 거품이 올라오는 것처럼 보여 거품정렬이다.
	 */

	public static int[] sort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - i - 1; j++) {

				if (arr[j] > arr[j + 1]) {
					Util.swap(arr, j, j + 1);
				}
			}
		}
		
		return arr;
	}

}
