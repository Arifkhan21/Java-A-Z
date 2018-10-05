package Assignment_hckrBlcks;

import java.util.Scanner;

public class PrintPrime {
    // Your Code Here
	public static void main(String[] args) {
		
	
    Scanner sc = new Scanner(System.in);
    
    int n = sc.nextInt();
    int i=2,j=2;
    int fl=0;
    while(i<=n)
    {      
        j=2;
        fl=0;
        while(j<=i)
        {
            if(i%j==0){
                fl=fl+1;
            }
            j++;
        }
        if(fl==1)
        System.out.println(j-1);
        i++;
    }
}
