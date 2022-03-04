package main;

import sort.BubbleSort;
import sort.InsertionSort;
import sort.SelectionSort;

public class Main {

	public static void main(String[] args) {
		
		final int N = 5;
		int[] arr = new int[N];
		Util.createArr(arr);
		
		BubbleSort bubbleSort = new BubbleSort();
		SelectionSort selectionSort = new SelectionSort();
		InsertionSort insertionSort = new InsertionSort();
		
		
		System.out.println("BubbleSort");
		Util.printArr(arr);
		Util.printArr(bubbleSort.sort(arr));
		
		System.out.println();
		Util.createArr(arr);

		System.out.println("SelectionSort");
		Util.printArr(arr);
		Util.printArr(selectionSort.sort(arr));
		
		System.out.println();
		Util.createArr(arr);
		
		System.out.println("InsertionSort");
		Util.printArr(arr);
		Util.printArr(insertionSort.sort(arr));
		
		

	}
}
