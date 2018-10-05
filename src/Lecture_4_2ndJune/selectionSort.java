package Lecture_4_2ndJune;

import java.util.Arrays;
import java.util.Scanner;

public class selectionSort {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array = makeArray();
		
		display(selection(array));

	}
	public static int[] makeArray() {
		
		int n=sc.nextInt();
		int[] arr =new int[n];

		for(int i=0;i<n;i++) {
			System.out.println(i+"th element please");
			arr[i]=sc.nextInt();
		}
		return arr;
	}
	public static int[] selection(int[] arr) {
	
		for(int i =0;i<arr.length-1;i++) {
			int min=i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]<arr[min]) {
					min=j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[min];
			arr[min]  = temp;
		}
		return arr;
	}

	public static void display(int[] arr) {
		Arrays.sort(arr);
		// enhanced for loop
		System.out.println("<----Displaying Full Array---->");
		for (int val : arr) {
			System.out.print(val + " ");
		}
	}
}
