import java.util.Scanner;

public class fibo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int fp0 = 0, fp1 = 1, fpn;
		System.out.println("The Fibonacci Series for " + n + "th term. ");
		System.out.print(fp0 + " " + fp1 + " ");
		for (int i = 2; i <= n; i++) {
			fpn = fp0 + fp1;
			System.out.print(fpn + " ");
			fp0 = fp1;
			fp1 = fpn;
		}
		sc.close();
	}

}
