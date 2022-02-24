package main;

import sort.BubbleSort;
import sort.SelectionSort;

public class Main {

	public static void main(String[] args) {
		
		int[] arr = new int[20];
		Util.initArr(arr);
		
		System.out.println("BubbleSort");
		Util.shuffleArr(arr);
		Util.printArr(arr);
		Util.printArr(BubbleSort.sort(arr));
		
		System.out.println();

		System.out.println("SelectionSort");
		Util.shuffleArr(arr);
		Util.printArr(arr);
		Util.printArr(SelectionSort.sort(arr));
		

	}
}
