package Assignment_hckrBlcks;

import java.util.*;
public class subArray01 {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
//        int tc =sc.nextInt();
        
        for(int x=1;x<=1;x++){
            
//            int n =sc.nextInt();
        	int n=4;
//            int[] arr = new int[n];
        	int[] arr = {1,1,1,1}; 
//            for(int e=0;e<n;e++)
//            arr[e]=sc.nextInt();
            boolean flag=true;
            int u=0,l=0,z=0,c=0,j=0,i=0,k=0;
           
           for( i=0;i<n;i++){
               for( j=n-i-1;j>=0;j--){
                   z=0;
                   c=0;
                   for( k=j;k>=i;k--){
                       if(arr[k]==0)
                       z++;
                       else
                       c++;
                   }
                   if(z==c){
                       l=i;
                       u=j;
                       i=n;
                       flag=false;
                       break;
                   }
               }
           }
            if(flag)
            System.out.println("None");
            else
            System.out.println(l+" "+u);
        }

    }
}