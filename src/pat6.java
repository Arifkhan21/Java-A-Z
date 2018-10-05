import java.util.Scanner;

public class pat6 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int nst=n;
		int nsp=0;
		
		for(int i=0;i<n;i++)
		{
			
			for(int j=0;j<nsp;j++)
				System.out.print(" ");
			for(int k=0;k<nst;k++)
				System.out.print("*");
			
			nsp+=2;
			nst-=1;
			System.out.println();
		
		}
		sc.close();
	}

}