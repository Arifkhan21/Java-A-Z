package Lecture_15_23June;

public class LinkedList {

	private Node head = null;
	private Node tail = null;
	private int size = 0;

	private class Node {
		
		int data;
		Node next;

	}

	private class Mover{
		Node left=head;
	}
	public int getFirst() throws Exception {
		if (this.size == 0)
			throw new Exception("Size is zero");

		return this.head.data;
	}

	public int getLast() throws Exception {
		if (this.size == 0)
			throw new Exception("Size is Zero");

		return this.tail.data;
	}

	public int getAt(int i) throws Exception {

		if (this.size == 0)
			throw new Exception("Size is Zero");

		if (i < 0 || i >= this.size)
			throw new Exception("Index is Wrong");

		Node temp = this.head;
		for (int x = 0; x < i; x++)
			temp = temp.next;

		return temp.data;

	}

	public Node getNodeAt(int i) throws Exception {

		if (this.size == 0)
			throw new Exception("Size is Zero");

		if (i < 0 || i >= this.size)
			throw new Exception("Index is Wrong");
		Node temp = this.head;
		for (int x = 0; x < i; x++)
			temp = temp.next;

		return temp;

	}

	public void addlast(int d) {

		Node n = new Node();
		n.data = d;

		if (this.size == 0) {
			this.head = n;
		} else {
			this.tail.next = n;
		}
		this.tail = n;
		this.size++;
	}

	public void display() {

		Node tmp = this.head;
		System.out.println("\n------------------");
		while (tmp != null) {
			System.out.print(tmp.data + " -> ");
			tmp = tmp.next;
		}
		System.out.println("\n-----------------");

	}

	public void addfirst(int d) {

		Node n = new Node();
		n.data = d;
		n.next = null;

		if (this.size == 0) {
			this.head = n;
			this.tail = n;
		} else {
			n.next = head;
			head = n;
		}
		this.size++;

	}

	public void addAt(int d, int i) {
		Node n = new Node();
		n.data = d;
		n.next = null;
		if (this.size == 0)
			addfirst(d);
		else if (i == this.size)
			addlast(d);
		else {
			Node tmp = head;
			for (int x = 0; x < i - 1; x++) {
				tmp = tmp.next;
			}

			n.next = tmp.next;
			tmp.next = n;
			size++;
		}

	}

	public int removelast() throws Exception {


		if (this.size == 0)
			throw new Exception("Size is Zero");
		Node t = this.tail;
		if (this.size == 1) {
			this.head = null;
			this.tail = null;
			size--;
		} else {
			Node n = getNodeAt(this.size - 2);
			n.next = null;
			this.tail = n;
			size--;
		}

		return t.data;

	}

	public int removefirst() throws Exception {

		if (this.size == 0)
			throw new Exception("Size is Zero");
		Node t = this.head;

		if (this.size == 1) {
			this.head = null;
			this.tail = null;
			size--;
		} else {
			head = head.next;
			size--;
		}

		return t.data;

	}

	public int removeAt(int i) throws Exception {

		if (this.size == 0)
			throw new Exception("Size is Zero");

		int t = 0;
		if (this.size == 1) {
			t = removefirst();
		} else if (i == size - 1) {
			t = removelast();
		} else {

			Node n = getNodeAt(i - 1);
			t = n.next.data;
			n.next = n.next.next;
			size--;
		}

		return t;

	}

	public void reversedataI(LinkedList ll) {



		Node n = this.head;
		while (n != null) {
			Node p = n.next;
			while (p != null) {
				{
					int tmp = p.data;
					p.data = n.data;
					n.data = tmp;
				}
				p = p.next;
			}
			n = n.next;
		}

	}

	public void reversepointI(LinkedList ll){


		
		
		
		Node prev = this.head;
		Node cur=this.head.next;
		
		while(cur!=null) {
				
				Node ah=cur.next;
				cur.next=prev;
				
				prev=cur;
				cur=ah;
		}
		Node tmp = this.tail;
		this.tail=this.head;
		this.head=tmp;
		
		this.tail.next=null;
		
	}

	public void reversePR() {


		
		
		rprh(this.head,this.head.next);
		
		Node tmp = this.tail;
		this.tail=this.head;
		this.head=tmp;
		
		this.tail.next=null;
		
	}
	
	private void rprh(Node prev,Node cur) {

		
		
		if(cur==null) {
			return;
		}
		
		
		rprh(cur,cur.next);
		
		cur.next=prev;
	
	}
	public void reverseDataR() {

		Mover m =new Mover();
		
		rdrh(m,head,0);	
	}
	private void rdrh(Mover mvr,Node right,int cnt) {

		if(right==null) {
			return;
		}
		
		rdrh(mvr,right.next,cnt+1);
		
		if(cnt>=this.size/2) {
			int tmp = mvr.left.data;
			mvr.left.data=right.data;
			right.data=tmp;
		}
		mvr.left=mvr.left.next;
		
	}

	public void foldLL() {

	
		Mover mvr= new Mover();
		
		foldh(mvr,head,0);
	
	}
	private void foldh(Mover m, Node right,int cnt) {

		
		if(right==null) {
			return;
		}
		
		foldh(m,right.next,cnt+1);
		
		
		if(cnt>=this.size/2) {
			int tmp=m.left.data;
			m.left.data=right.data;
			right.next.data=tmp;
		}
		if(cnt==this.size/2) {
			this.tail=right;
			this.tail.next=null;
		}
		
	}

	
	private LinkedList mergeTwoSortedLinkedlist(LinkedList sec)throws Exception {
		
		
		Node f= this.head;
		Node s = sec.head;
		LinkedList merged = new LinkedList();
		int fc=0,sc=0;
		while(f!=null&&s!=null)
		{
			
			if(fc<this.size&&sc<sec.size&&f.data<s.data) {
				merged.addlast(f.data);
				fc++;
			}
			else if(fc<this.size&&sc<sec.size){
				merged.addlast(s.data);
				sc++;
			}
			
			s=s.next;
			f=f.next;
			
		}
	 if(fc==this.size) {
			while(s!=null) {
				merged.addlast(s.data);
				sc++;
				s=s.next;
			}
			
		}
		else if(sc==sec.size) {
			while(f!=null) {
				merged.addlast(f.data);
				fc++;
				f=f.next;
			}
			
		}
		return merged;
		
	}
	
	public void mergesort() throws Exception {
	
		
		if(this.size==1) {
			return;
		}Node mid;
//		if(this.size%2==0)
		 mid=this.getNodeAt((this.size)/2);
//		else
//		 mid=this.getNodeAt(((this.size+1)/2));
		LinkedList fh=new LinkedList();
		LinkedList sh=new LinkedList();
		
		fh.head=this.head;
		sh.head=mid.next;
		fh.tail=mid;
		fh.tail.next=null;
		sh.tail=null;
		fh.size=((this.size+1)/2);
		sh.size=this.size/2;	
		
		fh.mergesort();
						
		sh.mergesort();
		
		LinkedList merged = fh.mergeTwoSortedLinkedlist(sh);
		
		this.head=merged.head;
		this.tail=merged.tail;
		this.size=merged.size;
		
		
		
		
		
	}
	
	
}
