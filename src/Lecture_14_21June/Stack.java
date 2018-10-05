 package Lecture_14_21June;

public class Stack{

	int[] data ;
	int tos;
	
	public Stack(){
		this.data= new int[5];
		this.tos = -1;
	}
	public Stack(int n){
		this.data= new int[n];
		this.tos = -1;
	}
	
	int size() {
		return this.tos+1;
	}
	
	boolean isEmpty() {
		return this.size()==0;
	}
	void push(int n) throws Exception {
		if(this.size()==this.data.length) {
//			throw new Exception("Stack is full");
			
			int[] a = this.data;
			this.data   = new int[2*a.length];
			for(int i=0;i<a.length;i++)
				this.data[i] = a[i];
		}
		this.tos++;
		this.data[tos] = n;
		
	}
	void pop() throws Exception {
		
		if(isEmpty())
			throw new Exception("Stack is Empty");
//		System.out.print(" Top Element is ->");
//		System.out.print(this.data[tos]);
//		System.out.println("\n--------------------");
		tos--;
	}
	int top() {
//		System.out.println(this.data[tos]);
//		System.out.println("\n--------------------");
		return this.data[tos];

	}
	
	void display() {
		for(int i=tos;i>=0;i--)
			System.out.println(this.data[i]+" ");
//		System.out.println("\n---------------------");

	}

}

