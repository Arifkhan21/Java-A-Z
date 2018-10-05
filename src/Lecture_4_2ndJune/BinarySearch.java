package Lecture_4_2ndJune;

import java.util.Scanner;

public class BinarySearch {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] array = makeArray();

		int x = sc.nextInt();
		System.out.println("print element to do binary search");
		binSearch(array,x);

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
	public static int binSearch(int[] arr,int x) {
		
		int lo = 0;
		int hi =arr.length -1;
		while(hi>lo) {
			int mid = lo+hi/2;
			
			if(x<arr[mid]) {
				hi =mid-1;
			}
			else if(x>arr[mid]) {
				lo=mid=1;
			}else if(x==arr[mid])
				return mid;
		}
		return -1;
	}
}
