package Assignment_hckrBlcks;

import java.util.Scanner;

public class PrintFibonacciNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  // Your Code Here
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int f1=0,f2=1;
        int f3=1;
        System.out.println(f1);
        System.out.println(f2);
        do{
            f3=f1+f2;
            f1=f2;
            f2=f3;
            if(f3<=n)
            System.out.println(f3);
            
            
        }while(f3<=n);
    

	}

}
