package Lecture_8_9June;

import java.util.ArrayList;
import java.util.Scanner;

public class keypad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		ArrayList<String> list =func(str,0);
//		list.add("");
		System.out.println(list);
		System.out.println(list.size());
		
		
		
		

	}
	public static String getcode(char ch) {
		
		if(ch=='1')
			return "abc";
		else if(ch=='2')
			return "def";
		else if(ch=='3')
			return "ghi";
		else if(ch=='4')
			return "jk";
		else if(ch=='5')
			return "lmno";
		else if(ch=='6')
			return "pqr";
		else if(ch=='7')
			return "stu";
		else if(ch=='8')
			return "vwx";
		else if(ch=='9')
			return "yz";
		else if(ch=='0')
			return "@#";
		else 
			return ""; 
	}

	public static ArrayList<String> func(String str,int n){
		
		
		if(n>=str.length()) {
			ArrayList<String>  br = new ArrayList<>();
			br.add(0,"");
			return br;
			}
		
		char ch= str.charAt(n);
		
		String s = getcode(ch);
		 
		ArrayList<String> list = func(str,n+1);
		ArrayList<String> listn= new ArrayList<>();
		int x = list.size();
		for(int i=0;i<s.length();i++) {
			for(String ss:list) {
			listn.add(s.charAt(i)+ss);
			}
		}
		
		return listn;
	}
}
