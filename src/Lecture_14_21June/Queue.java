package Lecture_14_21June;

public class Queue {

	protected int[] data;
	protected int size;
	protected int fr;

	Queue() {
		this.data = new int[5];
		this.size = 0;
		this.fr = 0;
	}

	Queue(int n) {
		this.data = new int[n];
		this.size = 0;
		this.fr = 0;
	}

	public int size() {
		return this.size;
	}

	public boolean isEmpty() {
		return this.size() == 0;
	}

	public void enqueue(int n) throws Exception {
		if(this.size()==data.length)
		{
			int a[]  = this.data;
			this.data = new int[2*a.length];
			for (int i = 0; i <this.size(); i++) {
				int in = (i+fr)%a.length;
			this.data[i] =a[in]; 
			}
			
			
		}
		
		(this.data[(this.size+this.fr)% this.data.length])  = n;
		this.size++;
		
	}

	public int dequeue() throws Exception {
		if (this.size() == 0) {
			throw new Exception("Queue is Empty");
		}
int r  = this.data[this.fr];
//		System.out.println(this.data[this.fr]);
		this.data[this.fr] = 0;
		this.fr++;
		this.size--;
		return r;
	}

	public void getfront() throws Exception {
		if (this.size() == 0) {
			throw new Exception("Queue is Empty");
		}
		System.out.println(this.data[this.fr]);
	}

	public void display() {

		for (int i = 0; i <this.size(); i++) {
			System.out.print(this.data[(i+fr)%this.data.length] + " ");
		}
		System.out.println("\n<------------------------>");
	}
}
