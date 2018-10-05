package Lecture_6_5June;

import java.util.Scanner;

public class expressionReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
//		System.out.println(str.length());
//	 String str = "The Sky Is Blue";
		str=str+" ";
	 
		String rev="";
		int x = 0;
		for(int i=0;i<str.length();i++) {
				char c = str.charAt(i);
			if((c+"").equals("*")||(c+"").equals("+")||(c+"").equals("-")||(c+"").equals("/")||(c+"").equals(" ")) {
				String w = str.substring(x,i);
				rev = (w).concat(rev);
				rev = (c+"").concat(rev);
				
				x=i+1;
			}
		}
		System.out.println(rev.substring(1));
		

	}

}
