package Lecture_6_5June;

import java.util.ArrayList;
import java.util.Scanner;

public class LargestBuild {
static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
       
         String str =sc.nextLine();		
		String[] arr=str.split(" ");
		int n= arr.length;
		String s = "";
		
		for(int i=0;i<n;i++) {
			Integer.ma
			String max="";
			int maxi=Integer.MAX_VALUE;
			for(int j=0;j<n;j++) {
				max="";
				int x= arr[i].compareTo(arr[j]);
				
				if(x<0) {
					max=arr[j];
					arr[j]="";
				}
				s=s+max;
				
				
			}
			
			
		}

		System.out.println(s);
		
	}

}
