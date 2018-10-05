package Assignment_hckrBlcks;

import java.util.Scanner;

public class PatMountain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
		    int n=sc.nextInt();
		    
		    int nsp=2*n-3;
		    int cnt=1;
		    
		    for(int i=1;i<=n;i++){
		        
		        for(int j=1;j<=i;j++)
		        System.out.print(j+"\t");
		        
		        for(int k=0;k<nsp;k++)
		        System.out.print("\t");
		        
		        for(int j=i;j>0;j--)
		        if(j!=n)
		        System.out.print(j+"\t");
		       
		        
		         nsp-=2; 
		         System.out.println();
		    }

	}

}
