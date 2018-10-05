package Assignment_hckrBlcks;
import java.util.*;
public class split {
    public static void main(String args[]) {
        // Your Code Here
        Scanner sc = new Scanner(System.in);
//        int n  = sc.nextInt();
//        int[] arr = new int[n];
        int n=6;
        int[] arr= {1,2,3,3,4,5};
        int sum=0;
        for(int i=0;i<n;i++){
//        arr[i] = sc.nextInt();
          sum+=arr[i];
        }
        sum=sum/2;
        
        func(arr,0,sum,0,0,"");
    }
    public static void func(int[] arr,int ind,int sum,int ls,int rs,String ans){
        
        if(ls==sum){
            System.out.println(ans+"AND"+"");
        return;
            
        }
        if(ls>sum)
        return;
        
        
        ls=ls+arr[ind];
        ans=ans+arr[ind];
//        for(int i=ind;i<arr.length;i++) {
        	for(int j=ind+1;j<arr.length;j++) {
        		func(arr,ind+1,sum,ls+arr[j],rs,ans+arr[j]);
//        	}
        }
        
        
        
        return;
        
    }
}
