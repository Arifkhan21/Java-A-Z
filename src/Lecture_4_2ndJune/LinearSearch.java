package Lecture_4_2ndJune;

import java.util.Scanner;

public class LinearSearch {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    	
		int[] array = makeArray();
		

		display(array);
		System.out.println("enter the item to search");
		int i = sc.nextInt();
		System.out.println(search(array,i));
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
//	public static void display(int[] arr) {
//
//		//enhanced for loop
//		for(int val:arr) {
//			System.out.print(val +" ");
//		}
//	}

	public static int search(int[] arr,int x) {
		for(int i =0;i<arr.length;i++) {
			if(arr[i]==x)
				return i;
		}
		return -1;
	}
}
