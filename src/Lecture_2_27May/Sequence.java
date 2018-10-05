import java.util.*;
public class Sequence {
    public static void main(String args[]) {

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
               
           }
           else if(next>prev){
               flag = false;
           }
           else{
               flagAns=false;
           }
           i++;
		
    }
}
}