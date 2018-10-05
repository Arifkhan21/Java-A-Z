package Assignment_hckrBlcks;

import java.util.Scanner;

public class patInvertedHourGlass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  
				Scanner sc = new Scanner(System.in);
				int n = sc.nextInt();

		        int nsp=2*n-1;
		        int nn=1;
		        int cnt;
		        for(int i=0;i<2*n+1;i++){
		            cnt=n;
		            for(int j=0;j<nn;j++){
		            System.out.print(cnt+" ");
		                cnt--;
		            }
		            for( int k=0;k<nsp;k++)
		            System.out.print("  ");
		            
		            for(int l=0;l<nn;l++){
		               
		               cnt++;
		               if(cnt!=0){
		                System.out.print(cnt+" ");
		            }
		                
		            }
		            
		            if(i<((2*n)+1)/2){
		                nsp-=2;
		                nn++;
		            }else
		            {
		                nsp+=2;
		                nn--;
		                }
		                System.out.println();
		        }

	}

}
