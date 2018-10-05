package Lecture_10_12June;

public class Queue {

	int[] data;
	int size;
	int fr;

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
			throw new Exception("Queue is Full");
		
		(this.data[(this.size+this.fr)% this.data.length])  = n;
		this.size++;
		
	}

	public void dequeue() throws Exception {
		if (this.size() == 0) {
			throw new Exception("Queue is Empty");
		}

		System.out.println(this.data[this.fr]);
		this.data[this.fr] = 0;
		this.fr++;
		this.size--;
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
