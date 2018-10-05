package Lecture_2;

import java.util.*;

public class Rotate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int r = sc.nextInt();
		int nt=n,rm,rot=1;
		int len=0;
        while(nt!=0) {
        	len++;
        	nt=nt/10;
        }
        while(true) {
		if(r>len)
		{
			r=r-len;
		}
		else if(r<0)
		{
			r=r+len;
		}
		else
			break;
		}
        
        while(rot<=r)
        {
        	rm=n%10;
        	n=n/10;
        	n+=(int)(Math.pow(10,len-1)*rm);
        	rot++;
        }
        
        System.out.println(n);
	}

}
