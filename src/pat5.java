import java.util.Scanner;

public class pat5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int nst=n*2 -1;
		int nsp=0;
		
		for(int i=0;i<n;i++)
		{
			
			for(int j=0;j<nsp;j++)
				System.out.print(" ");
			for(int k=0;k<nst;k++)
				System.out.print("*");
			
			nsp+=1;
			nst-=2;
			System.out.println();
		
		}
		sc.close();
	}

}