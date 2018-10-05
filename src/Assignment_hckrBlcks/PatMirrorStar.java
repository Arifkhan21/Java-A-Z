package Assignment_hckrBlcks;

import java.util.Scanner;

public class PatMirrorStar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int nst=1;
        int nsp=n/2;
        
        for(int i=0;i<n;i++){
            
            for(int j=0;j<nsp;j++)
            System.out.print("\t");
            
            for(int k=0;k<nst;k++)
            System.out.print("*\t");
            
            if(i<n/2){
                nst+=2;
                nsp--;
            }
            else{
                nst-=2;
                nsp++;
            }
            System.out.println();
        }
	}

}
