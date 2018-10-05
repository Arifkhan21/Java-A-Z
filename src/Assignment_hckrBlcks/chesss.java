 package Assignment_hckrBlcks;
//package /;

import java.util.*;

public class chesss {
	public static void main(String args[]) {
		// Your Code Here

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
//int n=3;
		System.out.println(chesscnt(0, 0, n));
		chess(0, 0, n, "{0-0}");
	}

	public static void chess(int cr, int cc, int n, String ans) {

		if (cr == n - 1 && cc == n - 1) {
			System.out.print(ans + " ");
			return;
		}
		if (cc >= n || cr >= n) {
			return;
		}
		
		
		chess(cr + 2, cc + 1, n, ans + "K" + "{" + (cr + 2) + "-" + (cc + 1) + "}");

		chess(cr + 1, cc + 2, n, ans + "K" + "{" + (cr + 1) + "-" + (cc + 2) + "}");


		
	
	
	
	
		if (cr == 0 || cr == n - 1 || cc == 0 || cc == n - 1)
			for (int i = 1; i + cr < n; i++)
				chess(cr + i, cc, n, ans + "R" + "{" + cc + "-" + (cr + i) + "}");
		if (cc == 0 || cc == n - 1 || cr == 0 || cr == n - 1)
			for (int i = 1; i + cc < n; i++)
				chess(cr, cc + i, n, ans + "R" + "{" + (cc + i) + "-" + cr + "}");

				

		
		if (cc == cr || cc + cr == n - 1)
			for (int i = 1; i + cr < n && i + cc < n; i++)
				chess(cr + i, cc + i, n, ans + "B" + "{" + (cc + i) + "-" + (cr + i) + "}");

		return;
	}

	public static int chesscnt(int cr, int cc, int n) {

		if (cr == n - 1 && cc == n - 1) {
			return 1;
		}
		if (cc >= n || cr >= n) {
			return 0;
		}

		int cnt = 0;
	    cnt += chesscnt(cr + 1, cc + 2, n);
		cnt += chesscnt(cr + 2, cc + 1, n);
	

		if (cr == 0 || cr == n - 1 || cc == 0 || cc == n - 1)
			for (int i = 1; i + cr < n; i++)
				cnt += chesscnt(cr + i, cc, n);

		if (cc == 0 || cc == n - 1 || cr == 0 || cr == n - 1)
			for (int i = 1; i + cc < n; i++)
				cnt += chesscnt(cr, cc + i, n);

		if (cc == cr || cc + cr == n - 1)
			for (int i = 1; i + cr < n & i + cc < n; i++)
				cnt += chesscnt(cr + i, cc + i, n);

		return cnt;
	}

}
