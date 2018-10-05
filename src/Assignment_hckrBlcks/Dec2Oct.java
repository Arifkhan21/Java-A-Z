package Assignment_hckrBlcks;

import java.util.Scanner;

public class Dec2Oct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   // Your Code Here
    	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	
	int r,ans=0,mul=1;
	while(n!=0) {
		r = n%8;
		ans = ans + r*mul;
	    mul=mul*10;
		n = n/8;
	}
	
	System.out.println(ans);
	}

}
