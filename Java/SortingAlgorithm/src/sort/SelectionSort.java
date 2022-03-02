package sort;

import main.Util;

public class SelectionSort implements Sort{
	/*
	 * 버블 정렬이 비교하고 바로 바꿔 넣는 걸 반복한다면 
	 * 이쪽은 일단 1번째부터 끝까지 훑어서 가장 작은 게 1번째, 
	 * 2번째부터 끝까지 훑어서 가장 작은 게 2번째……해서 (n-1)번 반복한다. 
	 * 
	 * 어찌 보면 인간이 사용하는 정렬 방식을 가장 많이 닮았다. 
	 * 
	 * 어떻게 정렬이 되어 있든 일관성 있게 n(n−1)/2에 비례하는 시간이 걸린다는 게 특징.
	 * 또한, 버블 정렬보다 두 배 정도 빠르다
	 */
	
	@Override
	public int[] sort(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			
			int min_index = i;
			
			for(int j = i; j< arr.length; j++) {
				if(arr[min_index] > arr[j]) {
					min_index = j;
				}
			}
			
			Util.swap(arr, i, min_index);
		}
		
		return arr;
	}
}
