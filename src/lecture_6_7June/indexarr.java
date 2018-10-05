package lecture_6_7June;

import java.util.Scanner;

public class indexarr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++)
			arr[i]  = sc.nextInt();
		
//		int[] ind=new int[3];
		int x=sc.nextInt();
		int[] ind =max(arr,0,x,0);
		for(int i=0;i<ind.length;i++)
		System.out.print(ind[i]+" ");
	}
	public static int[] max(int[] arr,int vdx,int x,int i) {
		
		
		if(vdx==arr.length) {
		int[] ind = new int[i];	
			return ind;
		}
		if(x==arr[vdx])
		{
			int[] ind = max(arr,vdx+1,x,i+1);
			ind[i] = vdx;
			return ind;
		}
		return max(arr,vdx+1,x,i);
	}
}