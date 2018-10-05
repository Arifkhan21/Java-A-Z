package Lecture_3;

import java.util.Scanner;

public class fer2cel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int ll = sc.nextInt();
		int ul = sc.nextInt();
		
		int step = sc.nextInt();
		System.out.println("C"+"\t"+"F");
		
		for(int i=ll;i<=ul;i+=step)
		{
			int f = (int)((5.0/9)*(i-32));
			System.out.println(i+"\t"+f);
		}
		

	}

}
