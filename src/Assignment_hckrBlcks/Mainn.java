package Assignment_hckrBlcks;
import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Mainn {
    public static void main(String args[])   {

        Scanner sc = new Scanner(System.in);
        // BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
        int tc = 1;
        
        for(int x =1;x<=tc;x++){
            
            int n = 6;
            
            int[] ht = {2,0,0,3,0,4};
//            int[] xt = new int[n];

            int mx=0,max=0,p=0;
//             while(sc.hasNext()&&p<n){
           
//             p++;}
             
            for(int i =0;i<n;i++){
        //   System.out.print(ht[i]+"\t");
            if(ht[i]>mx){
            mx=ht[i];
            max=i;
            }
                
            }
//            System.out.println(max);
          
            int water =0,ref=0;
            for(int i = -1;i<max;i++){
               
               
                if(ref>ht[i+1]){
                    water=water+ref-ht[i+1];
                }else if(ht[i+1]>=ref){
                    ref = ht[i+1];
                }
                
                   
            }
            ref=0;
            for(int i=n-1; i>max; i--){
               
               
                if(ref>ht[i-1])
                {
                    water = (water+ref) - ht[i-1];
                }
                else if(ht[i-1]>ref)
                {
                    ref = ht[i-1];
                }
        
                          

            }
              System.out.println(water);
            
        }
        
// 	public static int[] bubble(int[] arr) {
		
// 		for(int i =0;i<arr.length-1;i++) {
// 			for(int k=0;k<arr.length-1-i;k++) {
// 				if(arr[k]>arr[k+1]) {
// 					int temp = arr[k];
// 					arr[k]=arr[k+1];
// 					arr[k+1]=temp;
// 				}
// 			}
// 		}
// 		return arr;
// 	}
    }
}
  

