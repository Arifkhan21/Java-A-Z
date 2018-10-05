package Assignment_hckrBlcks;

import java.util.Scanner;

public class Bin2Dec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			
			int r,ans=0,mul=1;
			while(n!=0) {
				r = n%10;
				ans = ans + r*mul;
			    mul=mul*2;
				n = n/10;
			}
			
			System.out.println(ans);

	}

}
