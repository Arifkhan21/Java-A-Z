package Lecture_4_2ndJune;

import java.util.Scanner;

public class subsetArray {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = makeArray();
		
		int len  = array.length;
		display(array);
		subset(array,len);

	}
	public static int[] makeArray() {

		int n = sc.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			System.out.println(i + "th element please");
			arr[i] = sc.nextInt();
		}
		return arr;
	}
	
	public static void subset(int[] arr,int len) {
		
		int x =1;
		int n =(int)Math.pow(2, len)-1;
		while(x<=n) {
			
			
				
			for(int i =0;i<x;i++) {
			for(int k =0;k<x;k++) {
				System.out.print(arr[k]+" ");
			}
			System.out.println();
			
			}
			x++;
         }
		
	}
	public static void display(int[] arr) {

		// enhanced for loop
		System.out.println("<----Displaying Full Array---->");
		for (int val : arr) {
			System.out.print(val + " ");
		}
	}
}
