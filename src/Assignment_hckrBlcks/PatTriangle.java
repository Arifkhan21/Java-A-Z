package Assignment_hckrBlcks;

import java.util.Scanner;

public class PatTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int cnt=0;

		for (int i = 1; i <= n; i++) {
			
			for (int k = n - i; k > 0; k--)
				System.out.print("\t");

			for (int j = 0; j < ((i * 2) - 1); j++)
			{
			    if(j<=((i*2)-1)/2)
			   	cnt++;
			   	else
			   	cnt--;
			   	System.out.print(cnt+"\t");
			 

			}

			System.out.println();
		}
		sc.close();

	}

}
