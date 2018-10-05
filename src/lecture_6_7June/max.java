package lecture_6_7June;

import java.util.Scanner;

public class max{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++)
			arr[i]  = sc.nextInt();
//		int x=sc.nextInt();
		int a=max(arr,0,0);
		System.out.println(a);
	}
	public static int max(int[] arr,int vdx,int max) {
		
//		int max=arr[vdx];
		if(vdx==arr.length)
			return max;
		
		if(arr[vdx]>max)
			max=arr[vdx];
		
		return max(arr,vdx+1,max);
		
		
	}
}