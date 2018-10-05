package Lecture_4_2ndJune;

import java.util.Scanner;

public class SpiralDisplay {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		// int[][] array = takeInput();
		int[][] array = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		display(array);

	}

	public static void display(int[][] arr) {

		int rowmin = 0;
		int rowmax = arr.length;
		int colmin = 0;
		int colmax = arr[0].length;

		boolean flag = true;
		boolean flag2 = true;
		boolean flag3 = true;

		while (rowmin < rowmax && colmin < colmax) {

			if (flag) {

				if (flag2) {
					for (int i = rowmin; i < rowmax; i++) {
						System.out.print(arr[i][colmin] + " ");
					}
					flag2 = false;
					colmin++;
				} else {
					for (int i = rowmax-1; i >= rowmin; i--) {
						System.out.print(arr[i][colmax - 1] + " ");
					}
					flag2 = true;
					colmax--;

				}
				flag = false;

			} else {

				if (flag3) {
					for (int i = colmin; i < colmax; i++) {
						System.out.print(arr[rowmax-1][i] + " ");
					}
					flag3 = false;
					rowmax--;

				} else {
					for (int i = colmax-1; i >= colmin; i--) {
						System.out.print(arr[rowmin][i] + " ");
					}
					flag3 = true;
					rowmin++;
				}
				flag = true;
			}

		}
	}

	public static int[][] takeInput() {
		// TODO Auto-generated method stub
		System.out.println("no.of rows?");
		int rows = sc.nextInt();

		int[][] array = new int[rows][];

		for (int i = 0; i < rows; i++) {
			System.out.println("no of cols?");
			int cols = sc.nextInt();
			array[i] = new int[cols];
			for (int j = 0; j < cols; j++) {
				System.out.println("enter value for [" + i + ", " + j + "]");
				array[i][j] = sc.nextInt();
			}
		}
		return array;
	}

}
