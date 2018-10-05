package Assignment_hckrBlcks;

import java.util.Scanner;

public class pairOfRoses {

	    static Scanner sc = new Scanner(System.in);
	    public static void main(String args[]) {

	            int tc =sc.nextInt();
	            
	            for(int x=1;x<=tc;x++){
	                
	                
	                int nr = sc.nextInt();
	                int[] price = new int[nr];
	                
	                for(int i=0;i<nr;i++)
	                price[i]=sc.nextInt();
	                
	                
	                int m = sc.nextInt();
	                int a=0,b=0,ans1=0,ans2=0;
	                int diff,min=m;
	                for(int i =0;i<nr-1;i++){
	                    for(int j=i;j<nr;j++)
	                    {
	                        if(price[i]+price[j] == m){
	                            a=price[i];
	                            b=price[j];
	                            diff=Math.abs(a-b);
	                            if(diff<min){
	                             ans1 =a;
	                             ans2 =b;
	                            }
	                        }
	                    }
	                }
	                
	                System.out.println("Deepak should buy roses whose prices are "+(ans1<ans2?ans1:ans2)+" and "+(ans1>ans2?ans1:ans2)+". ");
	                System.out.println();
	                
	            }
	    }
	}

