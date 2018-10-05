package Lecture_4_2ndJune;

import java.util.Scanner;

public class waveDisplay {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		int[][] array = takeInput();
		display(array);

	}
public static void display(int[][] arr) {
		
		int rows = arr.length;
		int cols = arr[0].length;
		boolean flag =true;
		for(int j=0;j<cols;j++) {

		if(flag) {for(int i=0;i<rows;i++) {
				System.out.print(arr[i][j]+" ");
				
			}
		flag=false;}
		else {
			for(int i=rows-1;i>=0;i--) {
				System.out.print(arr[i][j]+" ");
			}
			flag=true;
		}
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
