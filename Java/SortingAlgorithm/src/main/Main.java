package main;

import bubbleSort.BubbleSort;

public class Main {

	public static void printArr(int[] arr) {
		System.out.print("[");
		for(int i = 0; i < arr.length; i++) {
			System.out.print(i);
			if(i != arr.length-1) {
				System.out.print(", ");
			}
		}
		System.out.println("]");
	}
	
	public static void main(String[] args) {

		int[] arr = { 0, 1, 2, 3, 4 };
		BubbleSort.sort(arr);
		printArr(arr);

	}
	
	
}
