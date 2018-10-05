package Assignment_hckrBlcks;

import java.util.Scanner;

public class targetSumPairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i<n;i++){
         arr[i] = sc.nextInt();
        }
        int t = sc.nextInt();
        
        for(int i=0;i<n;i++){
            
            for(int j=i+1;j<n;j++){
                
                if(arr[i]+arr[j]==t){
                    System.out.println((arr[i]<arr[j]?arr[i]:arr[j])+" and "+(arr[i]>arr[j]?arr[i]:arr[j]));
                }
            }
        }
	}

}
