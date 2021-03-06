package main;

import java.util.Random;

public class Util {

	public static void createArr(int[] arr) {
		initArr(arr);
		shuffleArr(arr);
	}

	
	private static void initArr(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
		}
	}

	private static void shuffleArr(int[] arr) {
		Random rand = new Random();

		for (int i = 0; i < arr.length; i++) {
			swap(arr, rand.nextInt(arr.length), rand.nextInt(arr.length));
		}
	}
	
	static void printArr(int[] arr) {
		System.out.print("[");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
			if (i != arr.length - 1) {
				System.out.print(", ");
			}
		}
		System.out.println("]");
	}
	
	public static void swap(int[] arr, int a, int b) {
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}
}
