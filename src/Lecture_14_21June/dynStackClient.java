package Lecture_14_21June;

import Lecture_13_19June.Stack;

public class dynStackClient {
	public static void main(String[] args) throws Exception {
		
		

		DStack s = new DStack(5);
		Stack n = new Stack();
		s.push(200);
		s.push(150);
		s.push(120);
		s.push(100);
		s.push(80);
		s.push(1000);
		s.display();
	}

}
