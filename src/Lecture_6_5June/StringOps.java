package Lecture_6_5June;

import java.util.Arrays;
import java.util.Scanner;

public class StringOps {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		String str = sc.nextLine();
           String str = "aasshhf";
		// boolean b = isPalindrome(str);
		// System.out.println(b);
		// subString(str);
		// SubsubString(str);
	dupl(str);
	}

	public static boolean isPalindrome(String str) {
		boolean ans = false;
		String rev = "";

		for (int i = str.length() - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);

		}
		if (str.equals(rev)) {
			ans = true;
		}

		return ans;
	}

	public static void subString(String str) {
		String s = "";
		for (int i = 0; i < str.length(); i++) {
			for (int j = i; j < str.length(); j++) {
				s = str.substring(i, j + 1);
				System.out.println(s);
			}
		}
	}

	public static void SubsubString(String str) {
		String s = "";
		for (int i = 0; i < str.length(); i++) {
			for (int j = i; j < str.length(); j++) {
				s = str.substring(i, j + 1);
				if (isPalindrome(s))
					System.out.println(s);
			}
		}
	}

	public static void toggle(String str) {
		StringBuilder sb = new StringBuilder(str);
		// System.out.println(sb.length());
		sb.
		for (int i = 0; i < sb.length(); i++) {
			char ch = sb.charAt(i);
			if (Character.isLowerCase(ch)) {
				ch = Character.toUpperCase(ch);
				sb.setCharAt(i, ch);
			} else {
				ch = Character.toLowerCase(ch);
				sb.setCharAt(i, ch);

			}
		}
		System.out.println(sb);

	}
	  public static char max(String str){
	        int m=0;
	        char ch='q';
	        char ans='w';
	        char[] arr = new char[str.length()+1];
	        arr[str.length()]='*';
	        str.getChars(0,str.length(),arr,0);
	        Arrays.sort(arr);
	        int max=0,cnt=0;
	        for(int i=0;i<arr.length-1;i++){
	            // System.out.println(arr[i]);
	            if(arr[i]==arr[i+1]){
	                cnt++;
	                
	            }else{
	                if(cnt>max){
	                    max=cnt;
	                    ans=arr[i];
	                    cnt=0;
	                }
	                
	            }
	        }
	    return ans;
	        
	    }
	  public static void dupl(String str){
	        StringBuilder sb=new StringBuilder(str);
	        int i=0;
	        boolean flag=false;
	        int n= str.length();
	        while(i<str.length()-1){
	            
	            if(str.charAt(i)==str.charAt(i+1))
	            {
	                sb.deleteCharAt(i);
	                i++;
	            }
	            else{
	                i++;
	            str.repla
	                // sb.append(str.charAt(i));
	                // i++;
	                // flag=true;
	            }
	        }str.
	        
	        // if(flag)
	        // sb.append(str.charAt(str.length()-1));
	        
	        System.out.println(sb.toString());
	    }
//	public static void fff(String str) {
////		 Scanner sc = new Scanner(System.in);
////	        String str = sc.nextLine();
//	        char ch,ch2;
//	        int diff;
//	        String in = "";   
//              str.getChars(srcBegin, srcEnd, dst, dstBegin);
//	        for(int i=0;i<str.length()-1;i++){
//	            ch = str.charAt(i);
//	            ch2 = str.charAt(i+1);
//	            
//	            diff=(ch2+"").compareTo(ch+"");
//	            
//	            in = ch+Integer.toString(diff)+ch2;
//	        }
//	        System.out.println(in);
//	}
}