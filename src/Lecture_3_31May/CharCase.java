package Lecture_3;

import java.util.Scanner;

public class CharCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		char ch = sc.nextLine().charAt(0);
//		char ch2 = sc.next().charAt(0);
		if(ch>='a'&&ch<='z') {
			System.out.println("Charachter is Lower Case");
			
		}else if(ch >= 'A'&&ch<= 'Z' ) {
			System.out.println("Charachter is Upper Case");
	
		}else {
			System.out.println("Invalid CHarachter");
			System.out.println(ch);

		}
	}

}
