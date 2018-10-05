package Lecture_5_3June;

import java.util.Scanner;

public class exit {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		 int[][] array = takeInput();
//		int[][] array = { {1 ,1,1 ,1,},{1 ,1,1 ,1,},{1 ,1,1 ,1,},{1 ,1,1 ,1,}};

	exitdoor(array);

	}

	public static void exitdoor(int[][] arr) {

		int rowmin = 0;
		int rowmax = arr.length;
		int colmin = 0;
		int colmax = arr[0].length;

		boolean flag = false;
		boolean flag2 = true;
		boolean flag3 = true;
		boolean mj = true;
		boolean f = false;

		int x = 0, y = 0, i, a = 0, b = 0, c = 0, d = 0;
		while (mj) {

			if (flag) {

				if (flag2) {
					f = false;
					for (i = rowmin; mj && i < arr.length; i++) {
						if (arr[i][c] == 1) {
							a = i;
							colmax--;
							f = true;
							break;
						}
					}

					if (!f) {
						x = arr.length - 1;
						y = c;
						mj = false;
					}
					flag2 = false;

				} else {
					f = false;
					for (i = rowmax - 1; mj && i >= 0; i--) {

						if (arr[i][d] == 1) {
							b = i;
							colmin++;
							f = true;
							break;
						}
					}
					if (!f) {
						x = 0;
						y = d;
						mj = false;
					}
					flag2 = true;

				}
				flag = false;

			} else {

				if (flag3) {
					f = false;
					for (i = colmin; mj && i < arr[0].length; i++) {
						if (arr[b][i] == 1) {
							c = i;
							rowmin++;
							f = true;
							break;
						}
					}
					if (!f) {

						x = b;
						y = arr[0].length - 1;

						mj = false;
					}
					flag3 = false;

				} else {
					f = false;
					for (i = colmax - 1; mj && i >= 0; i--) {
						if (arr[a][i] == 1) {
							d = i;
							rowmax--;
							f = true;
							break;
						}
					}
					if (!f) {
						x = a;
						y = 0;
						mj = false;
					} 
					flag3 = true;
				}
				flag = true;
			}

		}
		System.out.print(x + " " + y);
	}

	public static int[][] takeInput() {
		// TODO Auto-generated method stub
		int rows = sc.nextInt();
		int cols = sc.nextInt();
		int[][] array = new int[rows][cols];

		for (int i = 0; i < rows; i++) {

			for (int j = 0; j < cols; j++) {
				array[i][j] = sc.nextInt();
			}
		}
		return array;
	}

}
