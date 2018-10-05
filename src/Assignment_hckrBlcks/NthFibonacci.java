package Assignment_hckrBlcks;

import java.util.Scanner;

public class NthFibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	    
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        
        int f1=0, f2=1;
        int f3 = 0;
        int i=2;
        
        while(i<=n){
            
            f3=f1+f2;
            f1=f2;
            f2=f3;
            i++;
        }
        System.out.println(f3);
        
	}

}
