import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		while (true) {
			int a = sc.nextInt();
			if (a % 2 == 0)
				System.out.println("EVEN");

			else
				System.out.println("ODD");
		}
	}

}
