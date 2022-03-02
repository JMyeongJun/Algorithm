package sort;

import main.Util;

public class InsertionSort implements Sort{
	/*
	 * k번째 원소를 1부터 k-1까지와 비교해 적절한 위치에 끼워넣고 
	 * 그 뒤의 자료를 한 칸씩 뒤로 밀어내는 방식으로, 
	 * 평균적으론 빠른 편이나
	 * 자료구조에 따라선 뒤로 밀어내는데 걸리는 시간이 크며, 
	 * 앞의 예시처럼 작은 게 뒤쪽에 몰려있으면(내림차순의 경우 큰 게 뒤쪽에 몰려있으면)
	 * 시간이 많이 걸린다는 단점이 있다
	 */

	@Override
	public int[] sort(int[] arr) {

		for (int i = 1; i < arr.length; i++) {
//			int ind = i;
//			for (int j = ind - 1; (arr[j] > arr[ind]) && j != -1 && ind != 0; j--) {
//					Util.swap(arr, ind, j);
//					ind--;
//			}
//			for (int j = ind - 1; j >= 0; j--) {
//				if(arr[j] > arr[ind]) {
//					Util.swap(arr, ind, j);
//				}
//				ind--;
//			}
			for (int j = i; j >= 1; j--) {
				if(arr[j] < arr[j-1]) {
					Util.swap(arr, j, j-1);
				}else {
					break;
				}
			}
		}

		return arr;
	}
}
