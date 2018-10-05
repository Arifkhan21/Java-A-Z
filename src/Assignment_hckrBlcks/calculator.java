package Assignment_hckrBlcks;

import java.util.Scanner;

public class calculator {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    		
		char ch = sc.next().charAt(0);
		while(calc(ch)!=(-1000)) {
			if(calc(ch)!=(-2000)) {
				System.out.println(calc(ch));
			}
			ch = sc.next().charAt(0);
		}
		
	}
	
	public static int calc(char ch){
		
		int a,b;
	
    if(ch =='*')
    {
    	a = sc.nextInt();
    	b = sc.nextInt();
    	return(a*b);
    }
    else if(ch =='/') {
    	a = sc.nextInt();
	    b = sc.nextInt();
	    return((int)(a/b));}
	else if(ch =='+') {
		a = sc.nextInt();
    	b = sc.nextInt();
    	return(a+b);
	}
     else if(ch =='-') {
    	 a = sc.nextInt();
     	b = sc.nextInt();
     	return(a-b);
     	
     	}
     else if(ch =='%') {
    	 a = sc.nextInt();
     	b = sc.nextInt();
     	
     return(a%b);
     }
     else if(ch=='x'||ch=='X')
     {
    return -1000;	 
     }
     else {
     System.out.println("Invalid operation. Try again.");
     return -2000;     
	}

}
}
