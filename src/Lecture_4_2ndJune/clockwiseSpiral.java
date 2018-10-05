package Lecture_4_2ndJune;

import java.util.Scanner;

public class clockwiseSpiral {

		static Scanner sc = new Scanner(System.in);

		public static void main(String[] args) {

			int[][] array = takeInput();
			//int[][] array = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
			display(array);

		}

		public static void display(int[][] arr) {

			int rowmin = 0;
			int rowmax = arr.length;
			int colmin = 0;
			int colmax = arr[0].length;

			boolean flag = false;
			boolean flag2 = true;
			boolean flag3 = true;

			while (rowmin < rowmax && colmin < colmax) {

				if (flag) {

					if (flag2) {
						for (int i = rowmin; i < rowmax; i++) {
							System.out.print(arr[i][colmax-1] + ", ");
						}
						flag2 = false;
						colmax--;
					} else {
						for (int i = rowmax-1; i >= rowmin; i--) {
							System.out.print(arr[i][colmin] + ", ");
						}
						flag2 = true;
						colmin++;

					}
					flag = false;

				} else {

					if (flag3) {
						for (int i = colmin; i < colmax; i++) {
							System.out.print(arr[rowmin][i] + ", ");
						}
						flag3 = false;
						rowmin++;

					} else {
						for (int i = colmax-1; i >= colmin; i--) {
							System.out.print(arr[rowmax-1][i] + ", ");
						}
						flag3 = true;
						rowmax--;
					}
					flag = true;
				}

			}
			System.out.print("END");
		}

		public static int[][] takeInput() {
			// TODO Auto-generated method stub
//	 		System.out.println("no.of rows?");
			int rows = sc.nextInt();
		    int cols = sc.nextInt();    
			int[][] array = new int[rows][cols];

			for (int i = 0; i < rows; i++) {
//	 			System.out.println("no of cols?");
			
				
				for (int j = 0; j < cols; j++) {
					// System.out.println("enter value for [" + i + ", " + j + "]");
					array[i][j] = sc.nextInt();
				}
			}
			return array;
		}

	}


