import java.util.Scanner;

public class pat4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		 int a=n;
		int sp=(n*2) -1;
		
		for(int i=0;i<n;i++) {
			int x=n;

			for(int j=0;j<=i;j++) {
				System.out.print(x);
				x-=1;
			}
			
			for(int k=0;k<sp;k++)
				System.out.print(" ");
			
			x=n-i;
			for(int l=0;l<=i;l++)
			{
				
				System.out.print(x);
				x+=1;
			}
			
			System.out.println();
			sp-=2;
		}
		sp=0;
		for(int i=n;i>0;i--) {
			int x=n;

			for(int j=0;j<i;j++) {
				System.out.print(x);
				x-=1;
			}
			
			for(int k=0;k<sp;k++)
				System.out.print(" ");
			
			x=n-i;
			for(int l=0;l<=i;l++)
			{
				
				System.out.print(x);
				x+=1;
			}
			
			System.out.println();
			sp+=2;
		}

	}

}
