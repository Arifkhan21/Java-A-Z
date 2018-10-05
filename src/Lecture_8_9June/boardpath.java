package Lecture_8_9June;

import java.util.ArrayList;
import java.util.Scanner;

public class boardpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int curr = sc.nextInt();
		int end = sc.nextInt();

		ArrayList<String> list = board(curr, end);
		System.out.println(list);
		System.out.println(list.size());
	}

	
	public static ArrayList<String> board(int c, int e) {

		if (c == e) {
			ArrayList<String> br = new ArrayList<>();
			br.add("");
			return br;
		}
		ArrayList<String> mr = new ArrayList<>();
		for (int dice = 1; dice <= 6 && (c + dice <= e); dice++) {

			ArrayList<String> rr = board(c + dice, e);

			for (String s : rr) {
				mr.add(dice + s);
			}
		}

		return mr;

	}
	
}
