package Lecture_4_2ndJune;

import java.util.Scanner;

public class twoDArray {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		int[][] array = takeInput();
		display(array);

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
