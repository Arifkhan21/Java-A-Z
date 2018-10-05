package Assignment_hckrBlcks;

import java.util.Scanner;

public class PascalTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  Scanner sc = new Scanner(System.in);
		    
		    int n = sc.nextInt();
		    int term;
		    for(int i =0;i<n;i++)
		    {
		        for(int j=0;j<=i;j++){
		            term = (fact(i))/(fact(i-j)*fact(j));
		            System.out.print(term+"\t");
		        }
		        System.out.println();
		    }
		    }
		    public static int fact(int a){
		        int fact=1;
		        for( int i=1;i<=a;i++){
		            fact=fact*i;
		        }
		        return(fact);
	}

}
