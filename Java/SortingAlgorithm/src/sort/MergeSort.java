package sort;

import java.util.Arrays;

public class MergeSort implements Sort {

	@Override
	public int[] sort(int[] arr) {

		return arr;
	}

	public int div(int[] arr) {
		int[] div1 = new int[(arr.length + 1) / 2];
		int[] div2 = new int[arr.length - div1.length];

		for (int i = 0; i < div1.length; i++) {
			div1[i] = arr[i];
		}

		for (int i = 0; i < div2.length; i++) {
			div2[i] = arr[i + div1.length];
		}

		System.out.println(Arrays.toString(div1));
		System.out.println(Arrays.toString(div2));

		if(div1.length > 1) {
			div(div1);
		}
		if(div2.length > 1) {
			div(div2);
		}

		return div1[0];
	}

}
