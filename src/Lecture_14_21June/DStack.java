package Lecture_14_21June;

public class DStack extends Stack {


	public DStack(int n) {
		super(n);
	}
	
	@Override	
	void push(int n) throws Exception {
		if(this.size()==this.data.length) {
//			throw new Exception("Stack is full");
			super.push(n);
//			int[] a = this.data;
//			this.data   = new int[2*a.length];
//			for(int i=0;i<a.length;i++)
//				this.data[i] = a[i];
		}
		else {
		this.tos++;
		this.data[tos] = n;
		}
	}
}
