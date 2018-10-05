package Assignment_hckrBlcks;

import java.util.Scanner;

public class IsMirrorInverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int nt=n,fin=n,len=0,i=1,rm,in=0;
	     while(nt!=0) {
	        	len++;
	        	nt=nt/10;
	        }
	     
	     while(n!=0)
	     {
	    	 rm=n%10;
	    	 n=n/10;
	    	 in=in+(int)Math.pow(10, rm-1)*i;
	    	 i++;
	     }
	     if(fin==in){
	         System.out.print("true");
	     }else
	     System.out.print("false");
	}

}
