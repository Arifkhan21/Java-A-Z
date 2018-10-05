package Lec11_14June;

public class LinkedList {

	private Node head = null;
	private Node tail = null;
	private int size = 0;

	private class Node {
		int data;
		Node next;

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

}
