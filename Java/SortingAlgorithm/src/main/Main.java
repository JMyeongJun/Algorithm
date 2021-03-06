package main;

import sort.BubbleSort;
import sort.InsertionSort;
import sort.MergeSort;
import sort.SelectionSort;

public class Main {

	public static void main(String[] args) {
		
		final int N = 7;
		int[] arr = new int[N];
		Util.createArr(arr);
		
		BubbleSort bubbleSort = new BubbleSort();
		SelectionSort selectionSort = new SelectionSort();
		InsertionSort insertionSort = new InsertionSort();
		MergeSort mergeSort = new MergeSort();
		
		Util.printArr(arr);
		System.out.println(mergeSort.div(arr));
		
		
//		System.out.println("BubbleSort");
//		Util.printArr(arr);
//		Util.printArr(bubbleSort.sort(arr));
//		
//		System.out.println();
//		Util.createArr(arr);
//
//		System.out.println("SelectionSort");
//		Util.printArr(arr);
//		Util.printArr(selectionSort.sort(arr));
//		
//		System.out.println();
//		Util.createArr(arr);
//		
//		System.out.println("InsertionSort");
//		Util.printArr(arr);
//		Util.printArr(insertionSort.sort(arr));
		
		

	}
}
