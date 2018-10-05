import java.util.Scanner;

public class pat3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sp = 1;
		for (int i = 0; i < n/2; i++) {

			for (int k = (n - sp) / 2; k > 0; k--)
				System.out.print("*");
			for (int a = 0; a < sp; a++)
				System.out.print(" ");
			for (int k = 0; k < ((n - sp) / 2); k++)
				System.out.print("*");
			System.out.println();

			sp += 2;
		}
		sp = n ;
		for (int i = 0; i <= n / 2; i++) {

			for (int k = (n - sp) / 2; k > 0; k--)
				System.out.print("*");
			for (int a = 0; a < sp; a++)
				System.out.print(" ");
			for (int k = 0; k < ((n - sp) / 2); k++)
				System.out.print("*");
			System.out.println();
			sp -= 2;
		}
		sc.close();
	}

}