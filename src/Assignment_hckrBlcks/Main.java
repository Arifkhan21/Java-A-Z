package Assignment_hckrBlcks;
import java.util.*;
public class Main {
    public static void main(String args[]) {
        // Your Code Here
        System.out.println(lastprime(2,10));
    }
    
    
    public static int lastprime(int x,int n){
    
      
       
        
        for(int y = 0;y<x;y++)
        {
        int cnt=0,i=n;
        while(i>1){
            
            if(n%i==0){
            }
            i--;
        }
            
            if(cnt==1){
            y++;
            }
            n=n-1;
        }
        return n+1;
        
    }
    
    public static boolean isprime(int n){
        
        
        int cnt  = 0,i=2;
        while(i<=n){
            if(n%i==0){
                cnt++;
            }
            i++;
        }
            
            if(cnt==1)
            return true;
            
            return false;
    }
}
