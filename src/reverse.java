import java.util.Scanner;

public class reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str="";
        int r;
        while(n>0)
        {
        	r=n%10;
        	str=str+r;
        	n=n/10;
        }
        System.out.println("Reversed String is -> "+str);

	}

}
