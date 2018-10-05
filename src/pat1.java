import java.util.Scanner;

public class pat1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for(int i=n;i>=1;i--)
        {
        	for(int j=0;j<i;j++)
        	System.out.print("* ");
        System.out.println();
        }
	}

}
