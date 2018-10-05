package Lecture_10_12June;

public class QueueImplement {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		Queue q = new Queue();
		
		q.enqueue(20);
		q.enqueue(30);
		q.enqueue(40);
		q.enqueue(50);
		q.enqueue(60);
		
//		q.dequeue();
//		q.dequeue();
//		q.enqueue(100);
		q.getfront();
		q.display();
		
				
		

	}

}
