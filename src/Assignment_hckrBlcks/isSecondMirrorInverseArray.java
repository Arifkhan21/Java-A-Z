package Assignment_hckrBlcks;

import java.util.Scanner;

public class isSecondMirrorInverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner sc =new Scanner(System.in);
            int n = sc.nextInt();
            int[] arr = new int[n];
            int[] arr2 = new int[n];
            int[] arr3 = new int[n];
            boolean boo = true;
            int x;
            for(int i = 0;i<n;i++)
            {
                arr[i]=sc.nextInt();
                
            }
              for(int i = 0;i<n;i++)
            {
                arr3[i]=sc.nextInt();
                
            }
            
            for(int i =0;i<n;i++){
                x = arr[i];
                arr2[x]=i;
            }
            for(int i = 0;i<n;i++){
                if(arr3[i]==arr2[i]){
                    
                }else
                boo = false;
            }
            System.out.println(boo);


	}

}
