package Assignment_hckrBlcks;

import java.util.Scanner;

public class PatFibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner sc= new Scanner(System.in);
	         
	         int n=sc.nextInt();
	         int f1=0,f2=1;
	         int f3,f=1;
	         
	         for(int i=1;i<=n;i++)
	         {
	             for(int j=1;j<=i;j++)
	             {
	                 if(i==1){
	                 System.out.print(0+"\t");
	                 }
	                 else if(i==2){
	                     System.out.print(1+"\t");
	                     f1=1;
	                     f2=1;
	                     
	                 }
	                 else{
	                     f3=f2+f1;
	                     System.out.print(f3+"\t");
	                     f1=f2;
	                     f2=f3;
	                     
	                 }
	             }
	         
	             System.out.println();
	         }
	}

}
