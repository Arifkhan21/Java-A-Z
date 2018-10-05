package Assignment_hckrBlcks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class any {
	    public static void main(String args[]) {
	        // Your Code Here
	        
	        
	        
			Scanner sc = new Scanner(System.in);
					
//					int n = sc.nextInt();
			int n=7;
					int[] arr1 = {1,2,3,1,2,4,1};
					int[] arr2 = {2 ,1 ,3 ,1 ,5 ,2,2};
//	 				int arr1[]= new int[n];
//	                int arr2[]= new int[n];	
//	                for(int i=0;i<n;i++)
//	                arr1[i]=sc.nextInt();
//	                
//	                for(int i=0;i<n;i++)
//	                arr2[i]=sc.nextInt();
	                
	                Arrays.sort(arr1);
	                Arrays.sort(arr2);
	                
					ArrayList<Integer> list = new ArrayList<>();
					
					int l1 = arr1.length;
					int l2 = arr2.length;
					
					// int x = (l1<l2?l1:l2);
					int j=0,i=0;
					while(j<n-1&&i<n-1) {
						
						if(arr2[i]==arr1[j]) {
							list.add(arr2[i]);
							j++;
							i++;
						}
						else if(arr2[i]<arr1[j]) {
							i++;
						}
						else
							j++;
					}
					System.out.println(list);
	    }
	}



