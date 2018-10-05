package Lecture_3;

import java.util.Scanner;

public class ReArrange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int  n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		
		
		

	}

	public static int length(int n) {
		
		int i=0;
		while(n!=0) {
			i++; 
			n=n/10;	
		}
		return i;
	}
}
