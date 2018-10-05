package Assignment_hckrBlcks;

import java.util.Scanner;

public class maxx {

	
	
	    public static void main(String args[]) {

	        Scanner sc = new Scanner(System.in);
	        int tc = 1;
	        
	        for(int x=0;x<tc;x++){
	            
	            int n= 7;
	            int[] arr = {8,
	            int max=Integer.MIN_VALUE;
	            int sum;
	            for(int i=0;i<n;i++){
	                sum=0;
	                for(int j=0;j<n;j++)
	                sum=sum+arr[i+j];
	                
	                if(sum>max)
	                max=sum;
	            }
	            System.out.println(max);
	        }
	    }
	}


