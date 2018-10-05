package Assignment_hckrBlcks;

import java.util.Scanner;

public class PrintSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner sc = new Scanner(System.in);

int n1 = sc.nextInt();
int n2 = sc.nextInt();
int n=1,term;
  while(n1>0){
      term = (3*n) + 2;
      
      if(term%n2!=0){
          System.out.println(term);
          n1--;
      }
      n++;
  }
	}

}
