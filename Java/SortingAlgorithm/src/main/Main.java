package main;

import sort.BubbleSort;
import sort.InsertionSort;
import sort.SelectionSort;

public class Main {

	public static void main(String[] args) {
		
		final int N = 200;
		int[] arr = new int[N];
		Util.initArr(arr);
		
		BubbleSort bubbleSort = new BubbleSort();
		SelectionSort selectionSort = new SelectionSort();
		InsertionSort insertionSort = new InsertionSort();
		
//		
//		System.out.println("BubbleSort");
//		Util.shuffleArr(arr);
//		Util.printArr(arr);
//		Util.printArr(bubbleSort.sort(arr));
//		
//		System.out.println();
//
//		System.out.println("SelectionSort");
//		Util.shuffleArr(arr);
//		Util.printArr(arr);
//		Util.printArr(selectionSort.sort(arr));
//		
		System.out.println();
		
		System.out.println("InsertionSort");
		Util.shuffleArr(arr);
		Util.printArr(arr);
		Util.printArr(insertionSort.sort(arr));
		

	}
}
