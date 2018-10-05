package Assignment_hckrBlcks;

import java.util.Scanner;

public class SumEvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        Scanner sc= new Scanner(System.in);
         
         int n=sc.nextInt();
         int i=1,r;
         int se=0,so=0;
         while(n!=0)
         {
             r=n%10;
             
             if(i%2==0)
             se+=r;
             else
             so+=r;
             
             n=n/10;
             i++;
         }
         System.out.println(so);
         
         System.out.println(se);
	}

}
