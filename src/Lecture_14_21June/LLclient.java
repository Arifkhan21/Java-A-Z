package Lecture_14_21June;

public class LLclient {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		LinkedList ll = new LinkedList();
		
	ll.addfirst(90);
	ll.addfirst(80);
	ll.addfirst(70);
	ll.addfirst(60);
	ll.addfirst(50);
	ll.addfirst(40);
	ll.addfirst(30);
	ll.addfirst(20);
	ll.addfirst(10);
//		ll.display();
		ll.kreverse(ll, 3);
		ll.display();
	}

}
