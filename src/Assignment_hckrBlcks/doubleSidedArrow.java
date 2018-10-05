package Assignment_hckrBlcks;

import java.util.Scanner;

public class doubleSidedArrow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int nsp=n-1;
        int nn=1;
        int nsp2= -1;
        int cnt=1;
        
        for(int i=1;i<=n;i++){
            
            for(int j=0;j<nsp;j++)
            System.out.print("  ");
            
            if(i<=(n/2)+1)
            cnt=i;
            else
            cnt=n-i+1;
            for(int k=0;k<nn;k++){
            System.out.print(cnt+" ");
                cnt--;
            }
            for(int l=0;l<nsp2;l++){
                System.out.print("  ");
            }
            if(i!=1&&i!=n){
                cnt=1;
            for(int m=0;m<nn;m++){
                System.out.print(cnt+" ");
                cnt++;
            }}
            
            if(i<(n/2)+1){
                nsp-=2;
                nsp2+=2;
                nn++;
            }
            else{
                nsp+=2;
                nsp2-=2;
                nn--;
                
            }
            
           System.out.println(); 
        }

	}

}
