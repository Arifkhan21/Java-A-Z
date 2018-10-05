package Lecture_13_19June;

import java.util.Scanner;

public class soduko {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		 int n = sc.nextInt();
//		int n = 3;
		 int[][] arr = new int[n][n];

//		int[][] arr = { { 0, 0, 0 }, { 0, 0, 0 }, { 0, 0, 0 } };
		 for (int i = 0; i < n; i++)
		 for (int j = 0; j < n; j++) {
		 arr[i][j] = sc.nextInt();
		 }

		sodu(arr, n, 0, 0);

	}

	public static void sodu(int[][] arr, int n, int col, int row) {

		if (col == n) {
			//
			if (row == n - 1) {
				// System.out.println(n);
				for (int i = 0; i < n; i++) {
					for (int j = 0; j < n; j++) {
						System.out.print(arr[i][j] + " ");
					}
					System.out.println();
				}
				return;

			} else {
				sodu(arr, n, 0, row + 1);
				return;
			}
		}

		if (arr[row][col] == 0) {
			for (int k = 1; k <= n && col < n; k++) {
				if (isSafe(arr, k, col, row)) {
					arr[row][col] = k;
					sodu(arr, n, col + 1, row);
					arr[row][col] = 0;
				}
			}
		} else
			sodu(arr, n, col + 1, row);

	}

	public static boolean isSafe(int[][] arr, int k, int col, int row) {

		// column
		for (int c = 0; c < arr.length; c++) {
			if (arr[row][c] == k)
				return false;
		}

		// row
		for (int r = 0; r < arr.length; r++) {
			if (arr[r][col] == k)
				return false;
		}

		// grid

		 int r = row - (row % 3);
		 int c = col - (col % 3);
		
		 for (int rr = r; rr < r + 3; rr++) {
		 for (int cc = c; cc < c + 3; cc++) {
		 if (arr[rr][cc] == k)
		 return false;
		 }
		 }

		return true;

	}

}
