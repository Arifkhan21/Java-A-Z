package Lecture_14_21June;

public class stckuQueClient {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		StackUsingQueue st = new StackUsingQueue();
		
		st.push(10);
		st.push(20);
		st.push(30);
		st.push(40);
		st.push(50);
		st.push(60);
		
		System.out.println(st.pop());
		
	}

}
