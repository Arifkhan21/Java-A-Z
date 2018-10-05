import java.util.Scanner;

import com.sun.javafx.runtime.SystemProperties;

public class prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c=0;
        for(int i=1;i<=n;i++) {
        	if(n%i==0)
        		c++;
        }
        if(c==2) {
        	System.out.println("Is A Prime Number");
        }
        else
        	System.out.println("Not aprime number");

	}

}
