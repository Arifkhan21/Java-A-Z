package Lecture_13_19June;

import java.util.Scanner;

public class Nqueen {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n  =sc.nextInt();
	boolean[][]  arr = new boolean[n][n];
	nqueen(arr,0,n,"");
	
	
}


public static void nqueen(boolean[][] arr, int row, int n, String ans) {

	if (row == n) {
//		System.out.println(ans);
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(arr[i][j])
					System.out.print(" Q ");
				else
					System.out.print(" * ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();
		return;
	}

	for (int col = 0; col < arr.length; col++) {
		
		if(isSafe(arr,row,col)) {
			arr[row][col] = true;
		nqueen(arr, row + 1, n, ans +"{" + row + "-" + col + "}");
		arr[row][col] = false;
		}
	}
}
public static boolean isSafe(boolean[][] arr,int row,int col) {
	
	int r = row-1;
	int c = col;
	
	//up
	while(r>=0) {
		if(arr[r][c])
			return false;
		r--;
		
	}
	
	//diagonal left
	r=row-1;
	c=col-1;
	while(r>=0&&c>=0) {
		if(arr[r][c])
			return false;
		r--;
		c--;
		
	}
	//diagonal right
	r=row-1;
	c=col+1;
	while(r>=0&&c<arr[0].length) {
		if(arr[r][c])
			return false;
		r--;
		c++;
		
	}

	return true;
}
}
