package Assignment_hckrBlcks;

import java.util.Arrays;
import java.util.Scanner;

public class targetSumTriplets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		   Scanner sc = new Scanner(System.in);
		            int n = sc.nextInt();
		            
		            int[] arr = new int[n];
		            int[] ans = new int[3];

		            for(int i = 0;i<n;i++){
		             arr[i] = sc.nextInt();
		            }
		            Arrays.sort(arr);
		            int t = sc.nextInt();
		            
		            for(int i=0;i<n;i++){
		                
		                for(int j=i+1;j<n;j++){
		                    
		                    if((arr[i]+arr[j])<=t){
		                        
		                        for(int k=j+1;k<n;k++){
		                            
		                            if((arr[i]+arr[j]+arr[k])==t){
		                                ans[0]=arr[i];
		                                ans[1]=arr[j];
		                                ans[2]=arr[k];
		                                Arrays.sort(ans);
		                                System.out.println(ans[0]+", "+ans[1]+" and "+ans[2]);
		                                
		                            }
		                        }
		                    }
		                    
		                }
		            }
	}

}
