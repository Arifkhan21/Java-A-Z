package Lecture_8_9June;

import java.util.ArrayList;
import java.util.Scanner;

public class cointoss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		// String str = sc.next();
		int n = sc.nextInt();
		ArrayList<String> list = func(n);
		// list.add("");
		System.out.println(list);
		// System.out.println(list.size());

	}

	public static ArrayList<String> func(int n) {

		if (n == 0) {
			ArrayList<String> br = new ArrayList<>();
			br.add(0, "");
			return br;
		}

		ArrayList<String> list = func(n - 1);

		ArrayList<String> listn = new ArrayList<>();

		char[] ht = { 'H', 'T' };
		int x = list.size();
		for (int j = 0; j < ht.length; j++) {
			for (int i = 0; i < x; i++) {
				listn.add(ht[j] + list.get(i));
			}
		}

		return listn;
	}
}
