import java.util.*;
public class firr {
    public static void main(String args[]) {
        // Your Code Here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        for(int i=0;i<n;i++)
        arr[i] = sc.nextInt();
        
        int a = sc.nextInt();
        
        int r = func(a,arr,n);
        
        if(r==-1)
        {
            System.out.println(a);
        }
        else
        System.out.println(r);
              
        }
        public static int func(int x,int a[],int n){
            for(int j=0;j<n;j++)
            {
            if(a[j]==x){
            return(j);
                }
                else 
                return(-1);
        }
       return 0;
        }
    }