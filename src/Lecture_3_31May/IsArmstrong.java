package Lecture_3;

import java.util.Scanner;

public class IsArmstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc  = new Scanner(System.in);

	//int n = sc.nextInt();
		int ll = sc.nextInt();
		int ul = sc.nextInt();

		//int len = length(n);
	    	check(ll,ul);
		//boolean ans =  arms(n,len);
	//System.out.println(ans);
		
	}
	public static int length(int n) {
		
		int i=0;
		while(n!=0) {
			i++; 
			n=n/10;	
		}
		return i;
	}
	public static boolean arms(int n,int i) {
		
		int res =0;
		int num=n;
		while(n!=0) {	
		int r=n%10;
		res=res+(int)Math.pow(r, i);
		n=n/10;
		}
		
		if(res==num)
			return true;
		else 
			return false;
		
	}
	public static void check(int l, int u) {
		
		for(int i=l;i<=u;i++) {
		int len = length(i);
		boolean boo = arms(i,len);
		
		if(boo) {
			System.out.println(i);
		}
		}
	}
}