package Assignment_hckrBlcks;

import java.util.Scanner;

public class reverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        Scanner sc = new Scanner(System.in);

        int n=sc.nextInt();

        int[] arr = new int[n];
        for(int i=n-1;i>=0;i--)
        arr[i]=sc.nextInt();
        
        for(int i:arr)
        System.out.println(i);
        

	}

}
