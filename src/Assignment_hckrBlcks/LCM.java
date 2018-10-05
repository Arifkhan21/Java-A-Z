package Assignment_hckrBlcks;

import java.util.Scanner;

public class LCM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  Scanner sc= new Scanner(System.in);
		    
		    int a = sc.nextInt();
		    int b = sc.nextInt();
		    int max=1;
		    int lcm;
		      int i=1;
		      while(i<=a&&i<=b)
		      {
		          if(a%i==0&&b%i==0&&i>max)
		          {
		              max=i;
		          }
		          i++;
		      }
		      
		      lcm = (a*b)/max;
		      System.out.println(lcm);
	}

}
