package Lecture_2;

import java.util.Scanner;

public class c1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int n= sc.nextInt();
		
		int row = 2*n -1;
		
		 int nsp=n-1;
		int nst = n;
		
		for(int i=1;i<=row;i++) {
		for(int csp=0;csp<nsp;csp++) {
			System.out.print(" ");
			
		}
		for(int cst =0;cst<nst;cst++) {
			System.out.print("*");
		}
		if(i<n) {
			nst--;
			nsp--;
		}
		else {
			nst++;
			nsp++;
		}
		System.out.println();
		}
		
	}

}
