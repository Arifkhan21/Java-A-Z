package Lecture_5_3June;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListSumm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
//		int arr1[]= {9,9,9,5,6};
//		int arr2[] = {9,9};
		int l1 = sc.nextInt();
		int[] arr1 =new int[l1];
		System.out.println("enter elements of 1st array");
		for(int i=0;i<l1;i++)
		{
			arr1[i] = sc.nextInt();
		}
		int l2 = sc.nextInt();
				
		
		int[] arr2 = new int[l2];
		System.out.println("enter elements of 2nd array");
		for(int i=0;i<l2;i++)
		{
			arr2[i] = sc.nextInt();
		}
		
		
		ArrayList<Integer> list = new ArrayList<>();
		
//		int l1 = arr1.length;
//		int l2 = arr2.length;
		
		int x = (l1>l2?l1:l2);
		int y = (l1<l2?l1:l2);
	
		int car = 0,ans;
		
		for(int j=y-1;j>=0;j--) {
			ans = arr1[x-y+j]+arr2[j]+car;
			car = ans/10;
			ans=ans%10;
			list.add(0,ans);
		}
		for(int i=x-y-1;i>=0;i--) {
			ans = arr1[i]+car;
			car = ans/10;
			ans=ans%10;
			list.add(0,ans);
		}
		if(car>0)
			list.add(0,car);
		
		System.out.println(list);

	}

}
