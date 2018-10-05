package Lecture_2;

import java.util.Scanner;

public class Dec2Bin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int r,ans=0,mul=1;
		while(n!=0) {
			r = n%2;
			ans = ans + r* mul;
		    mul=mul*10;
			n = n/2;
		}
		
		System.out.println(ans);
        sc.close();

	}
	}


