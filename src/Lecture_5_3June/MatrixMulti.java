package Lecture_5_3June;

import java.util.Scanner;

public class MatrixMulti {

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] arr1 = {{1,2,3},{4,5,6}};
		int[][] arr2 = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
		
		int r1 = arr1.length;
		int c1 = arr1[0].length;
		int r2 = arr2.length;
		int c2 = arr2[0].length;
		
		if(c1==r2) {
			int r3 = r1;
			int c3 = c2;
			int[][] arr3 = new int[r3][c3];
			int sum=0;
			for(int i=0;i<r3;i++) {
				for(int j=0;j<c3;j++) {
					sum=0;
					for(int k=0;k<c1;k++) {
						sum=sum+ arr1[i][k]*arr2[k][j];
					}
					arr3[i][j] = sum;
				}
			}
			display(arr3);
		}
		
		

	}
public static void display(int[][] arr) {
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static int[][] takeInput(){
		// TODO Auto-generated method stub
				System.out.println("no.of rows?");
				int rows = sc.nextInt();
				
				int[][] array = new int[rows][];
				
				for(int i=0;i<rows;i++) {
					System.out.println("no of cols?");
					int cols = sc.nextInt();
					array[i] = new int[cols];
					for(int j=0;j<cols;j++) {
						System.out.println("enter value for ["+i+", "+j+"]");
						array[i][j] = sc.nextInt();
					}
				}
				return array;
	}


}
