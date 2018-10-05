package Lecture_9_10June;

import java.util.Scanner;

public class RecursionNew {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		// String str = sc.next();
		//
		// subseq(str,"");
		// subseqASCII(str,"");
		// keypad(str,"");
//		 permu("abc","");
		// System.out.println(boardpath(10,0,""));
		int[] arr = { 1, 2,3, 3, 4,5 };
		// System.out.println(mazepath(0,0,2,2,""));
//		 lexico(0,10);
		arraysum(arr, 0, 0, 9, "");
		// coinHH(3,"",false);
	}

	public static void subseq(String ques, String ans) {

		if (ques.length() == 0) {
			System.out.println(ans);
			return;

		}

		char ch = ques.charAt(0);
		String roq = ques.substring(1);

		subseq(roq, ans);// ch not included
		subseq(roq, ans + ch);// ch included
	}

	public static void subseqASCII(String ques, String ans) {

		if (ques.length() == 0) {
			System.out.println(ans);
			return;

		}

		char ch = ques.charAt(0);
		String roq = ques.substring(1);

		subseqASCII(roq, ans);
		subseqASCII(roq, ans + ch);
		subseqASCII(roq, ans + (int) ch);

	}

	public static String getcode(char ch) {

		if (ch == '1')
			return "abc";
		else if (ch == '2')
			return "def";
		else if (ch == '3')
			return "ghi";
		else if (ch == '4')
			return "jk";
		else if (ch == '5')
			return "lmno";
		else if (ch == '6')
			return "pqr";
		else if (ch == '7')
			return "stu";
		else if (ch == '8')
			return "vwx";
		else if (ch == '9')
			return "yz";
		else if (ch == '0')
			return "@#";
		else
			return "";
	}

	public static void keypad(String str, String ans) {

		if (str.length() == 0) {
			System.out.println(ans);
			return;
		}

		char ch = str.charAt(0);
		String res = str.substring(1);

		String s = getcode(ch);

		for (int i = 0; i < s.length(); i++) {

			keypad(res, ans + s.charAt(i));
		}
	}

	public static void permu(String str, String ans) {

		if (str.length() == 0) {
			System.out.println(ans);
			return;
		}

		for (int i = 0; i < str.length(); i++) {

			char ch = str.charAt(i);
			StringBuilder res = new StringBuilder(str);
			res = res.deleteCharAt(i);

			permu(res.toString(), ans + ch);
		}
	}

	// public static void permuDup(String str,String ans) {
	//
	// if(str.length()==0) {
	// System.out.println(ans);
	// return;
	// }
	//
	// for(int i=0;i<str.length();i++) {
	//
	// char ch = str.charAt(i);
	// StringBuilder res = new StringBuilder(str);
	// res = res.deleteCharAt(i);
	//
	// permu(res.toString(),ans+ch);
	// }
	// }

	public static void lexico(int n) {

		if (n > 1000) {

		}

		if (n > 100) {
			return;
		}
		
		
		if (n == 0) {
			for (int i = 1; i < 10; i++) {

				lexico((i * 10) + i);
			}
		} else {
			for (int i = 0; i < 10; i++) {
				lexico((i * 10) + i);
			}

		}

	}

	public static int boardpath(int des, int pres, String ans) {

		if (pres == des) {
			System.out.println(ans);
			return 1;
		}

		int count = 0;
		for (int i = 1; i <= 6; i++) {

			if (pres + i <= des)
				count += boardpath(des, pres + i, ans + i);

		}

		return count;
	}

	public static int mazepath(int cr, int cc, int er, int ec, String ans) {

		if (cc == ec && cr == er) {
			System.out.println(ans);
			return 1;
		}

		int count = 0;
		if (cc <= ec)
			count += mazepath(cr, cc + 1, er, ec, ans + "H");

		if (cr <= er)
			count += mazepath(cr + 1, cc, er, ec, ans + "V");

		return count;
	}

	public static void arraysum(int[] arr, int vdx, int x, int n, String ans) {

		if (vdx == arr.length) {
			if (x == n) {
				System.out.println(ans);
			}
			return;
		}
		if (vdx > arr.length) {
			return;
		}
		arraysum(arr, vdx + 1, x, n, ans);
		arraysum(arr, vdx + 1, x + arr[vdx], n, ans + arr[vdx]);

	}

	public static int coin(int n, String ans) {
		if (ans.length() == n) {
			System.out.println(ans);
			return 1;
		}
		int ch = 0, ct = 0;
		if (ans.length() <= n) {
			ch = coin(n, ans + "H");

			ct = coin(n, ans + "T");
		}
		return ch + ct;
	}

	public static int coinHH(int n, String ans, boolean last) {
		if (ans.length() == n) {
			System.out.println(ans);
			return 1;
		}
		int ch = 0, ct = 0;
		if (ans.length() <= n) {
			if (!last) {
				last = true;
				ch = coinHH(n, ans + "H", last);
			}

			last = false;
			ct = coinHH(n, ans + "T", last);

		}
		return ch + ct;
	}

}