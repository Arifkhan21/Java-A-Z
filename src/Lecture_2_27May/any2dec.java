package Lecture_2;

import java.util.Scanner;

public class any2dec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int b = sc.nextInt();
		int r,ans=0,mul=1;
		while(n!=0) {
			r = n%10;
			ans = ans + r* mul;
		    mul=mul*b;
			n = n/10;
		}
		
		System.out.println(ans);
		
	}

}
