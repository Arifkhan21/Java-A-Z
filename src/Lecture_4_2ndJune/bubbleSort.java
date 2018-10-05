package Lecture_4_2ndJune;

import java.util.Arrays;
import java.util.Scanner;

public class bubbleSort {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array = makeArray();
		
		display(bubble(array));

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
	public static int[] bubble(int[] arr) {
		
		for(int i =0;i<arr.length-1;i++) {
			for(int k=0;k<arr.length-1-i;k++) {
				if(arr[k]>arr[k+1]) {
					int temp = arr[k];
					arr[k]=arr[k+1];
					arr[k+1]=temp;
				}
			}
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
