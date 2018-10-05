package Lecture_14_21June;

import java.util.Scanner;

public class StockSpan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		// int n=7;
		int[] arr = new int[n];
		// int[] arr = {3,5,1,6,4,7,2};
		for (int i = 0; i < n; i++)
			arr[i] = sc.nextInt();

		int[] a = new int[n];
		int cnt = 1;
		a[0] = 1;
		int max=Integer.MIN_VALUE;
		int maxi=-1;
		for (int i = 1; i < n; i++) {
			if(arr[i]>max)
				maxi=i;
			cnt++;
			if (arr[i] >= arr[i - 1]) {
				if(arr[i]>max) {
				a[i] = cnt;
				max=Integer.MIN_VALUE;
				}
				else
					a[i]=cnt-maxi;
			} else {
				a[i] = 1;
				max=Integer.MIN_VALUE;
			}
		}
		for (int i : a)
			System.out.print(i + " ");
	}

}
