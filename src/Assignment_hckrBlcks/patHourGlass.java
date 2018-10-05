package Assignment_hckrBlcks;

import java.util.Scanner;

public class patHourGlass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   
				Scanner sc = new Scanner(System.in);
				int n = sc.nextInt();

		        int nsp=0;
		        int x=(2*n)+1;
		        int nn=(2*n)+1;
		        int cnt=n+1;
		        for(int i=0;i<2*n+1;i++){
		           
		            for(int j=0;j<nsp;j++)
		            System.out.print("  ");
		            
		            for(int k=0;k<nn;k++){
		                if(k<=nn/2){
		                    cnt--;
		                }else
		                cnt++;
		                System.out.print(cnt+" ");
		            }
		            
		            if(i<((2*n)+1)/2){
		                nsp++;
		                nn-=2;
		                 cnt=n-i;
		            }
		            else{
		                cnt=i-n+2;
		                nsp--;
		                nn+=2;
		            }
		            System.out.println();
		        }
	}

}
