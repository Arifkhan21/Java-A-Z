package Lecture_13_19June;

import java.util.Scanner;

public class nKnight {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n  =sc.nextInt();
	boolean[][]  arr = new boolean[n][n];
	knight(arr,0,n,"",0);
	
	
}


public static void knight(boolean[][] arr, int row, int n, String ans,int cnt) {

	if (cnt==arr.length) {
//		System.out.println(ans);
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(arr[i][j])
					System.out.print(" K ");
				else
					System.out.print(" * ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();
		return;
	}
	
	
	int col=0;
	for (col = 0; col < arr.length&&cnt!=arr.length; col++) {
		if(isSafe(arr,row,col)) {
			arr[row][col] = true;
			cnt++;
		}
		
		knight(arr, row + 1, n, ans +"{" + row + "-" + col + "}",cnt);
		arr[row][col] = false;
	}
	
	
	
}
public static boolean isSafe(boolean[][] arr,int row,int col) {
	
	int r = row;
	int c = col;
	
	//up left
	if(r-2>=0&&c-1>=0&&arr[row-2][col-1])
		return false;
	
	
	if(r-1>=0&&c-2>=0&&arr[row-1][col-2])
		return false;
	
	if(r-1>=0&&c+2<arr.length&&arr[row-1][col+2])
		return false;
	
	if(r-2>=0&&c+1<arr.length&&arr[row-2][col+1])
		return false;
	//down
	if(r+2<arr.length&&c-1>=0&&arr[row+2][col-1])
		return false;
	if(r+1<arr.length&&c-2>=0&&arr[row+1][col-2])
		return false;
	if(r+2<arr.length&&c+1<arr.length&&arr[row+2][col+1])
		return false;
	if(r+1<arr.length&&c+2<arr.length&&arr[row+1][col+2])
		return false;
	
	
		
	
	
	return true;
}
}
