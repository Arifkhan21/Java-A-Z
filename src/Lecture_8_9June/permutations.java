package Lecture_8_9June;

import java.util.ArrayList;
import java.util.Scanner;

public class permutations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		ArrayList<String> list =func(str,0);
//		list.add("");
		System.out.println(list);
		System.out.println(list.size());
		
		
		
		

	}
	

	public static ArrayList<String> func(String str,int n){
		
		
		if(n>=str.length()) {
			ArrayList<String>  br = new ArrayList<>();
			br.add(0,"");
			return br;
			}
		
		char ch= str.charAt(n);
		 
		ArrayList<String> list = func(str,n+1);
		ArrayList<String> listn= new ArrayList<>();
		
		for(int j=0;j<list.size();j++)
		{
			String x = list.get(j);
		
			for(int i=0;i<=x.length();i++) {
			listn.add(x.substring(0,i)+ch+x.substring(i));
			}
		}
		
		return listn;
	}
}
