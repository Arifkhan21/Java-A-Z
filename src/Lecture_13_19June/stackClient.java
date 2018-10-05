package Lecture_13_19June;

import java.util.Scanner;
//Lecture_10_12June;

public class stackClient {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		Stack s = new Stack();
		Stack n = new Stack();
		s.push(200);
		s.push(150);
		s.push(120);
		s.push(100);
		s.push(80);

		s.display();
		// displayrev(s);
		actrev(s, n, s.size());
//		System.out.println(s.size());
		System.out.println();
		System.out.println();
		s.display();

	}

	public static void displayrev(Stack s) throws Exception {

		if (s.size() == 0) {
			System.out.println("revv");
			return;
		}

		int temp = s.top();
		s.pop();
		displayrev(s);
		System.out.println(temp);

		s.push(temp);
	}

	public static void actrev(Stack s, Stack n, int z) throws Exception {

		if (s.size() == 0) {
			return;
		}

		if (s.size() > 0) {
			int temp = s.top();
			s.pop();

			actrev(s, n, z);
			n.push(temp);
		}

		if (n.size() == z) {
			int x = n.size();
			for (int i = 0; i < x; i++) {
				s.push(n.top());
				n.pop();
			}
		}

	}

}
