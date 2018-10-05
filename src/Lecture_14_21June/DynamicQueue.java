package Lecture_14_21June;

public class DynamicQueue extends Queue {

	DynamicQueue() {
		super();

	}

	DynamicQueue(int n) {
		super(n);
	}

	public void enqueue(int n) throws Exception {
		if (this.size() == data.length)
			super.enqueue(n);
		else {
			(this.data[(this.size + this.fr) % this.data.length]) = n;
			this.size++;
		}
	}
	public void revdisplay() {
		
	}

}
