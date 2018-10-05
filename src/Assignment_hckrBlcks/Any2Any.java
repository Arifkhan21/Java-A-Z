package Assignment_hckrBlcks;

import java.util.Scanner;

public class Any2Any {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int  b = sc.nextInt();
        int a =sc.nextInt();
        int n = sc.nextInt();

		int num = dec(n,b);
		int r,ans=0,mul=1;
		while(num!=0) {
			r = num%a;
			ans = ans + r*mul;
		    mul=mul*10;
			num = num/a;
		}
		
		System.out.println(ans);
    }
    public static int dec(int n, int b){
        int mul=1,r,ans=0;
        while(n!=0){
            r = n%10;
            ans = ans + mul*r;
            n=n/10;
            mul = mul*b;
        }

        return(ans);
    }
	

}
