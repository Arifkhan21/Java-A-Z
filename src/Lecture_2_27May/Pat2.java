package Lecture_2;

import java.util.Scanner;

public class Pat2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int row = n;

		int nsp = -1;
		int nst = (n / 2)+1;

		for (int i = 1; i <= row; i++) {

			for (int cst = 1; cst <= nst; cst++) {
				System.out.print("*");
			}
			
			
			for (int csp = 0; csp < nsp; csp++) {
					System.out.print(" ");

			}
            if(i==1||i==n)
			for (int cst = 1; cst < nst; cst++) {
				System.out.print("*");
			}else
				for (int cst = 1; cst <= nst; cst++) {
					System.out.print("*");
				}
				
			
			if (i <= (n / 2) + 1) {
				
				nst--;
				nsp += 2;
			} else {
				nst++;
				nsp -= 2;
			}
			System.out.println();
		}

	}

}
