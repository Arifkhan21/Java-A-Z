package Lecture_14_21June;

public class StackUsingQueue {

	DynamicQueue queue =new DynamicQueue();
	
	public void push(int item) throws Exception {
		try{
			queue.enqueue(item);
			
		}catch(Exception e){
			throw new Exception("Stack is Full");
		}
		
	}
	public int pop() throws Exception {
		
		DynamicQueue h = new DynamicQueue(queue.size);
		
		while(queue.size>1) {
			int n = queue.dequeue();
			h.enqueue(n);
		}
		int n = queue.dequeue();
		queue = h;
		return n;
	}
	public void display() {
	revdisplay();	
	}
	private void revdisplay() {
		int cnt=0;
		
	}
	
	
}
