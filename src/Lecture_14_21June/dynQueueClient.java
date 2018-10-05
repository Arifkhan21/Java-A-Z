package Lecture_14_21June;

public class dynQueueClient {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Queue q = new DynamicQueue(5);
		q.enqueue(10);
		q.enqueue(20);
		q.enqueue(30);
		q.enqueue(40);
		q.enqueue(50);
		q.display();
		q.enqueue(60);
		q.display();
		q.dequeue();
		q.display();
	}

}
