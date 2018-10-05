package Lecture_4_2ndJune;

import java.util.Scanner;

public class ArrayRotate {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = makeArray();
		
		display(array);

		int len  = array.length;
		
		System.out.println("\nEnter the rotate index");
		int r = sc.nextInt();
		int[] arr2 = rotate(array,len,r);
		
		display(arr2);

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
	public static int[] rotate(int[] arr,int l,int r) {
		
		int[] arr2 = new int[l];
		
		
		r = r%l;
		if(r<0) {
			r=r+l;
		}
		int x = 0;
		for(int i =l-r;i<l;i++) {
			arr2[x] = arr[i];
			x++;
		}for(int i =0;i<l-r;i++) {
			arr2[x] = arr[i];
			x++;
		}
		return arr2;
		
	}
	public static void display(int[] arr) {

		// enhanced for loop
		System.out.println("<----Displaying Full Array---->");
		for (int val : arr) {
			System.out.print(val + " ");
		}
		System.out.println();
	}

}
