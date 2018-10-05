package Assignment_hckrBlcks;

import java.util.Scanner;

public class validInvalidSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

			int n = sc.nextInt();
			int i = 0;
			int next, prev;
			boolean flag=true;
			boolean flagAns=true;
			prev = sc.nextInt();

			while (i < n-1) {
				next = sc.nextInt();

	           if(next<prev&&flag){
	               flag=true;
	           }
	           else if(next>prev){
	               flag = false;
	           }
	           else{
	               flagAns=false;
	           }
	           i++;
	           prev = next;
			
	    }
	    System.out.println(flagAns);
	}

}
