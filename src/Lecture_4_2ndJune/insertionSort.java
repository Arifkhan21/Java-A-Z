package Lecture_4_2ndJune;

import java.util.Arrays;
import java.util.Scanner;

public class insertionSort {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array = makeArray();
		
		display(insertion(array));

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
	public static int[] insertion(int[] arr) {
		
		int n = arr.length;

	for(int cnt =1;cnt<n;cnt++) {
		
		int temp = arr[cnt];
		int j=cnt-1;
		while(j>=0&&arr[j]>temp) {
			
//			if(arr[j]>temp) {
				
				arr[j+1]=arr[j];
//			}
			j--;
		}
		
		arr[j+1]=temp;
	}
	
		
		return arr;
	}
	public static void display(int[] arr) {
		// enhanced for loop
		System.out.println("<----Displaying Full Array---->");
		for (int val : arr) {
			System.out.print(val + " ");
		}
	}

}
