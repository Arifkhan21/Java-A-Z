package Lecture_4_2ndJune;

import java.util.Scanner;

public class subarraySum {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = makeArray();
		
		System.out.println("enter the sum to achieve");
		int sum = sc.nextInt();
		
		subarray(arr,sum);
		

	}
	public static void subarray(int[] arr,int sum) {
		
		int n = arr.length;
		for(int i=0;i<n;i++) {
			int s=0;
			int x = arr[i];
			s=s+x;
			for(int j=i+1;j<n;j++) {
				if(sum==s) {
					System.out.println(i+" "+(j-1));
					i=n;
					break;
					
				}else  {
					s=s+arr[j];
					
				}
			}
			
		}
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

}
