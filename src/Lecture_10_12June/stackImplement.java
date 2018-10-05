package Lecture_10_12June;

public class stackImplement {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		Stack stk = new Stack();
		
		stk.push(20);
		stk.push(50);
		stk.push(60);
		stk.push(100);
		stk.pop();
		stk.display();
		stk.pop();
		stk.push(25);
		stk.top();
		
		

	}

}
