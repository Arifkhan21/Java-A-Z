import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, sum = 0, c = 1;
		Scanner sc = new Scanner(System.in);

		n = sc.nextInt();
		while (c <= n) {
			sum = sum + c;
			c++;
			System.out.println(sum);
		}

	}

}
