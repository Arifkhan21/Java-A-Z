package Assignment_hckrBlcks;

import java.util.Scanner;

public class Log {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner sc = new Scanner(System.in);
int x=sc.nextInt();
int n=sc.nextInt();
int log=0;
while(x!=0){
    x=x/n;
    log++;
    
}
System.out.println(--log);

	}

}
