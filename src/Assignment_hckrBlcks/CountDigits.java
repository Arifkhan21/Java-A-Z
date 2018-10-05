package Assignment_hckrBlcks;

import java.util.Scanner;

public class CountDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner sc = new Scanner(System.in);
		    int n = sc.nextInt();
		    int x = sc.nextInt();
		    int r,cnt=0;
		    while(n!=0){
		        r=n%10;
		        if(r==x)
		        cnt++;
		        n=n/10;
		    }
		    System.out.print(cnt);
	}

}
