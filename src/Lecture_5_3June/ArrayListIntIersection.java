package Lecture_5_3June;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListIntIersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
				
				int arr1[]= {10,20,20,30,30,50,50,60,80,90,100};
				int arr2[] = {10,10,20,30,30,40,50,70,70};
				
				ArrayList<Integer> list = new ArrayList<>();
				
				int l1 = arr1.length;
				int l2 = arr2.length;
				
				int x = (l1<l2?l1:l2);
				int j=0;
				for(int i = 0;i<x;i++) {
					
					if(arr1[i]==arr2[j]) {
						list.add(arr1[i]);
						j++;
					}else if(arr1[i]>arr2[j]) {
						j++;
					}
				}
				System.out.println(list);
	}

}
