package Assignment_hckrBlcks;

import java.util.Scanner;

public class PatHollowDiamond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner sc = new Scanner(System.in);
	        
	        int n= sc.nextInt();
	        int nsp = -1;
	        int nst = n/2+1;
	        
	        for(int i=0;i<n;i++){
	            
	            for(int j=0;j<nst;j++)
	            System.out.print("*\t");
	            
	            for(int k=0;k<nsp;k++)
	            System.out.print("\t");
	            
	            for(int j=0;j<nst;j++){
	            if((i==0||i==n-1)&&j==0)
	            j++;
	            
	            System.out.print("*\t");}
	            
	            if(i<n/2){
	                nsp+=2;
	                nst--;
	            }else
	            {
	                nsp-=2;
	                nst++;
	            }
	            System.out.println();
	        }
	}

}
