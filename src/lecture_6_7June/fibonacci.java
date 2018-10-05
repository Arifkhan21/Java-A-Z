package lecture_6_7June;

import java.util.Scanner;

public class fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();		
		int a=fibo(n);
		System.out.println(a);
	}
	public static int fibo(int n) {
		
		if(n==0||n==1)
			return n;
		
		return(fibo(n-1)+fibo(n-2));
	}

}
