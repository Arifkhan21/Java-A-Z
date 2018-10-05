package Assignment_hckrBlcks;

import java.util.Scanner;

public class rain {
	
	    public static void main(String args[]) {

	        Scanner sc = new Scanner(System.in);
	        
//	        
	        
	        for(int x =1;x<=1;x++){
	            
	            int n = 12;
	            
	          //  int[] ht = {0,1,0,2,1,0,1,3,2,1,2,1};
	            int[] ht = new int[n];

	            int max=0,mx=0;
	            for(int i =0;i<n;i++){
	           ht[i]=sc.nextInt();
	            if(ht[i]>mx) {
	                mx=ht[i];
	                max=i;}
	                
	            }
	            System.out.println(max);
	            
	          
	            int water =0,ref=0;
	            for(int i = -1;i<max;i++){
	               
	               
	                if(ref>ht[i+1]){
	                    water=water+ref-ht[i+1];
	                }else if(ht[i+1]>ref){
	                    ref = ht[i+1];
	                }
	                
	                    else{
	                    water =water+0;
	                }
	            }
	            ref=0;
	            for(int i=n-1; i>max; i--){
	               
	               
	                if(ref>ht[i-1])
	                {
	                    water = (water+ref) - ht[i-1];
	                }
	                else 
	                // if(ht[i-1]>ref)
	                {
	                    ref = ht[i-1];
	                }
	        
	                          

	            }
	              System.out.println(water);
	            
	        }

	    }
	}
	  




