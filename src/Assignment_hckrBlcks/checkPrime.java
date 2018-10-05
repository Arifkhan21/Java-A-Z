package Assignment_hckrBlcks;

import java.util.Scanner;

public class checkPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		    Scanner sc = new Scanner(System.in);
		    int n = sc.nextInt();
		    int i=2;
		    int fl=0;
		    while(i<n&&fl==0)
		    {
		        if(n%i==0)
		        {
		            System.out.println("Not Prime");
		            fl=1;
		            
		        }
		            i++;
		    }
		    if(fl==0){
		     System.out.println("Prime");   
		    }
		    }
		}
	