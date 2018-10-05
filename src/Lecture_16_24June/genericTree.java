package Lecture_16_24June;

import java.util.ArrayList;
import java.util.Scanner;

public class genericTree {

	Scanner sc =new Scanner(System.in);
	private class Node{
		int data;
		ArrayList<Node> child = new ArrayList<>();
	}
	private Node root;
	
	public genericTree() {
		root=takeInput(null,0);
	}
	
	public Node takeInput(Node parent,int beta) {


		
		Node nn=new Node();
		if(parent==null) {
			System.out.println(" Enter the data of first Node(Root) ");
		}else {
			System.out.println("Enter the data of "+beta+"th Node of "+parent.data);
		}
		
		int d= sc.nextInt();
		nn.data=d;
		
		System.out.println("Enter the no of childs of your node");
		int noc= sc.nextInt();
		
		for(int i=0;i<noc;i++) {
			Node n=takeInput(nn,i); 
			nn.child.add(n);
		}
		
		return nn;
		
		
		
	}
	
	public void display() {
		display(this.root);
	}
	public void display(Node n) {

		
		
		String str=n.data + "->";
		
		for(int i=0;i<n.child.size();i++) {
			str+=n.child.get(i).data+" ,";
			
		}
		
		System.out.println(str);
		for(Node ch:n.child)
		display(ch);
		
		
		
		
	}

	public int size() {
		return size(root);
	}
	private int size(Node rt) {
		
		int cnt=0;
		for(Node ch:rt.child) {
			
			cnt+=size(ch);
		

		}
		
		return cnt+1;
		
	}
	
	public int max() {


		return max(root,root.data);
	}
	private int max(Node n,int ma) {
			
		for(int i=0;i<n.child.size();i++) {
			Node x=n.child.get(i);
			
			if(x.data>ma) {
				ma=x.data;
			}
			
		ma= max(x,ma);
		}
		return ma;
	}
	

	public boolean find(int item) {


		return find(root,item);
	}
	private boolean find(Node n,int item) {

		if(n.data==item) {
			return true;
		}
		
		for(Node x:n.child) {
			boolean ans=find(x,item);
			if(ans)
				return ans;
		}
		
		return false;
		
	}
	
public int ht() {
	return ht(root);
}
public int ht(Node n) {
	
	
	int hit=-1;
	for(Node x : n.child)
		hit=ht(x);
	
	return hit+1;
}
}
