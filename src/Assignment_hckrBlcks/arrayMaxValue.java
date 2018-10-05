package Assignment_hckrBlcks;

import java.util.Scanner;

public class arrayMaxValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner sc = new Scanner(System.in);

            int n=sc.nextInt();

            int[] arr = new int[n];
            for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
            
            int max=maxx(arr);
            System.out.println(max);
}

public static int maxx(int[] arr){
            int max=-10000;
            for(int x:arr){
                if(x>=max)
                max=x;
            }
            return max;
	}

}
