package Assignment_hckrBlcks;

import java.util.Scanner;

public class patRhombus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   Scanner sc = new Scanner(System.in);
		      int n = sc.nextInt();
		      int nsp=n-1;
		      int nn =1;
		      int cnt=0;
		      
		      for(int i=0;i<2*n-1;i++){
		          
		          for(int j=0;j<nsp;j++)
		           System.out.print("\t");
		          
		          for(int k=0;k<nn;k++){
		              
		              
		              if(k<nn/2+1)
		              cnt++;
		              else
		              cnt--;
		              
		            
		              System.out.print(cnt+"\t");
		          }
		      if(i<n-1){
		          nsp--;
		          nn+=2;
		      }
		      else{
		          nsp++;
		          nn-=2;
		          cnt-=2;
		          
		      }
		      System.out.println();
		      }

	}

}
