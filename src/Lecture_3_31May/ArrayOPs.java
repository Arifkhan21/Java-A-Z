
package Lecture_3_31May;

import java.util.Scanner;

public class ArrayOPs {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Operation in Arrays
		int[] array = makeArray();
		System.out.println("Print element to do linear search");
		int x = sc.nextInt();
		int ans = linSearch(array, x);
		System.out.println("element return status -->\t" + ans);

		System.out.println("Print element to do binary search");
		x = sc.nextInt();

		ans = binSearch(array, x);
		System.out.println("element return status -->\t" + ans);

		display(array);
		
		
        int len  = array.length;
		
		System.out.println("\nEnter the rotate index");
		int r = sc.nextInt();
		int[] arr2 = rotate(array,len,r);
		
		display(arr2);
		
		//Sorting ????
//		display(bubbleSort(array));
//		display(selectionSort(array));
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

	public static void display(int[] arr) {

		// enhanced for loop
		System.out.println("<----Displaying Full Array---->");
		for (int val : arr) {
			System.out.print(val + " ");
		}
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
	public static int binSearch(int[] arr, int x) {

		int lo = 0;
		int hi = arr.length - 1;
		while (hi > lo) {
			int mid = (lo + hi) / 2;

			if (x < arr[mid]) {
				hi = mid - 1;
			} else if (x > arr[mid]) {
				lo = mid = 1;
			} else if (x == arr[mid])
				return mid;
		}
		return -1;
	}

	public static int linSearch(int[] arr, int x) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == x)
				return i;
		}
		return -1;
	}
public static int[] bubbleSort(int[] arr) {
		
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
public static int[] selectionSort(int[] arr) {
	
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
}
