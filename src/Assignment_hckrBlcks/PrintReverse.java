import java.util.*;
public class Main {
    public static void PrintReverse(String args[]) {
        // Your Code Here
        
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int rev=0;
        int r;
        
        while(n!=0){
        
            r=n%10;
            rev=rev*10 + r;
            n=n/10;
            
        }
        System.out.println(rev);
    }
}
