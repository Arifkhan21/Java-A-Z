package Lecture_2;

import java.util.Scanner;
public class Oct2Bin {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		
	}
	public static dec(int inp,int x) {
		int r,ans=0,mul=1;
		while(inp!=0) {
			r = inp%10;
			ans = ans + r* mul;
		    mul=mul*x;
			n = n/10;
		}
	}
}
