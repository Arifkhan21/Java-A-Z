package Assignment_hckrBlcks;

import java.util.Scanner;

public class Far2Cel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int ll = sc.nextInt();
		int ul = sc.nextInt();
		
		int step = sc.nextInt();

		
		for(int i=ll;i<=ul;i+=step)
		{
			int f = (int)((5.0/9)*(i-32));
			System.out.println(i+" "+f);
		}

	}

}
