package Lecture_12_17June;

import java.util.Arrays;

public class TnOps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// System.out.println(countSS("nittin"));
		int[] arr = { 10, 20, 40, 2, 5, 25 };

		// // SoE(37);
		// int[] sorted = mergesort(arr, 0, arr.length - 1);
		//
		// for (int i : sorted)
		// System.out.print(i + " ");
		quicksort(arr, 0, arr.length - 1);
		// boolean[][] arr = new boolean[4][4];
		// nqueen(arr,0,4,"");

		for (int i : arr)
			System.out.println(i);

	}

	public static int countSS(String str) {

		int cnt = 0;
		// odd
		for (int axis = 0; axis < str.length(); axis++) {

			for (int orbit = 0; orbit + axis < str.length() && axis - orbit >= 0; orbit++) {

				if (str.charAt(axis + orbit) == str.charAt(axis - orbit)) {
					cnt++;
				} else {
					break;
				}
			}
		}

		// even
		for (double axis = 0.5; axis < str.length(); axis++) {

			for (double orbit = 0.5; orbit + axis < str.length() && axis - orbit >= 0; orbit++) {

				if (str.charAt((int) (axis + orbit)) == str.charAt((int) (axis - orbit))) {
					cnt++;
				} else {
					break;
				}
			}
		}

		return cnt;
	}

	public static void SoE(int n) {

		Boolean[] arr = new Boolean[n + 1];
		Arrays.fill(arr, true);

		for (int i = 2; i * i <= n; i++) {

			if (arr[i] == true)
				for (int mul = 2; i * mul <= n; mul++) {
					arr[mul * i] = false;
				}
		}
		for (int i = 2; i < n; i++) {
			if (arr[i])
				System.out.println(i);
		}
	}

	public static int[] mergesort(int[] arr, int lo, int hi) {

		if (hi == lo) {
			int[] ba = new int[1];
			ba[0] = arr[lo];
			return ba;

		}

		int mid = (hi + lo) / 2;

		int[] fh = mergesort(arr, lo, mid);
		int[] sh = mergesort(arr, mid + 1, hi);

		return mergetwosorted(fh, sh);

	}

	public static int[] mergetwosorted(int[] one, int[] two) {

		int[] arr = new int[one.length + two.length];

		int k = 0, i = 0, j = 0;
		while (i < one.length && j < two.length) {

			if (one[i] < two[j]) {
				arr[k] = one[i];
				k++;
				i++;
			} else {
				arr[k] = two[j];
				k++;
				j++;
			}

		}
		if (i == one.length) {
			while (j < two.length) {
				arr[k] = two[j];
				k++;
				j++;
			}
		}

		if (j == two.length) {
			while (i < one.length) {
				arr[k] = one[i];
				k++;
				i++;
			}
		}

		return arr;
	}

	public static void quicksort(int[] arr, int lo, int hi) {

		if (lo >= hi) {
			return;
		}

		int mid = (lo + hi) / 2;
		int pivot = arr[mid];

		int left = lo;
		int right = hi;

		while (left <= right) {

			while (arr[left] < pivot) {
				left++;
			}
			while (arr[right] > pivot) {
				right--;
			}

			if (left <= right) {
				int temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
				left++;
				right--;
			}

		}

		quicksort(arr, lo, right);
		quicksort(arr, left, hi);

	}

	public static void nqueen(boolean[][] arr, int row, int n, String ans) {

		if (row == n) {
			System.out.println(ans);
			return;
		}

		for (int col = 0; col < arr.length; col++) {
			nqueen(arr, row + 1, n, ans + "{" + col + "-" + row + "}");

		}
	}
}
