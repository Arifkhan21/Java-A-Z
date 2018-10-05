package Assignment_hckrBlcks;

import java.util.Scanner;

public class PatNumberLadder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner sc= new Scanner(System.in);
	         
	         int n=sc.nextInt();
	         int c=1;
	         for(int i=0;i<=n;i++)
	         {
	             for(int j=0;j<i;j++){
	             System.out.print(c+"\t");
	             
	                 c++;
	             }
	             System.out.println();
	         }

	}

}
