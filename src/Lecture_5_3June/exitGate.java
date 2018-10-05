package Lecture_5_3June;

import java.util.Scanner;

public class exitGate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		int c = sc.nextInt();
		int[][] arr = takeInput();

		
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
