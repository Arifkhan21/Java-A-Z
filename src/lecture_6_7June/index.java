package lecture_6_7June;

import java.util.Scanner;

public class index {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++)
			arr[i]  = sc.nextInt();
		int x=sc.nextInt();
		int a=ind(arr,0,x);
		System.out.println(a);
	}
	public static int ind(int[] arr,int vdx,int x)
	{
		if(vdx==arr.length)
			return -1;
		
		 if(x== arr[vdx])
			 return vdx;
		  	
		 
		 int ans =ind(arr,vdx+1,x);
		 return ans;

		   	
	}
}
