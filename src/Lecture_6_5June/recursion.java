package Lecture_6_5June;

import java.util.Scanner;

public class recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		// int n= sc.nextInt();
		// recurr(n);
		// int f = fact(n);

		System.out.println(power(3, 5));
	}

	public static void recurr(int n) {
		if (n == 0) {
			return;
		}
		if (n % 2 != 0)
			System.out.println(n);
		recurr(n - 1);
		if (n % 2 == 0)
			System.out.println(n);

	}

	public static int fact(int n) {

		if (n == 1)
			return 1;
		return (n * fact(n - 1));

	}

	public static int power(int i, int n) {
		if (n == 0)
			return 1;

		int p = i * power(i, n - 1);
		return (p);

	}

}
