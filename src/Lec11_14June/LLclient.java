package Lec11_14June;

public class LLclient {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		LinkedList ll = new LinkedList();
		
		ll.addlast(10);
		ll.addlast(20);
		ll.addlast(30);
		ll.addlast(40);
		ll.addlast(50);
//		ll.display();
		ll.addfirst(5);
		ll.display();
		ll.addAt(35, 3);
		ll.display();
		ll.removelast();
		ll.display();
		ll.removeAt(3);
		ll.display();
	}

}
