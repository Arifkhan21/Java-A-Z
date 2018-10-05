package Assignment_hckrBlcks;

import java.util.ArrayList;
import java.util.Scanner;
public class chewbecca {
    public static void main(String args[]) {
        // Your Code Here
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        long n = sc.nextLong();
       
        long rem=0;
        int item=0;
        while(n!=0){
            rem=n%10;
            list.add(0,(int)rem);
            n=n/10;
            
        }
        // System.out.println(list);
        for(int i =list.size()-1;i>=0;i--){
            if(!(i==0&&list.get(0)==9)){
                
            
            item = list.get(i);
            if(item>=5)
            item = 9-item;
            
            list.set(i,item);
        }
        }
        boolean flag= false;;
        for(int y:list){
            
            if(y!=0||flag){
                    System.out.print(y);
                    flag=true;}

        }
        if(!flag){
            System.out.print(9);
            for(int i =1;i<list.size();i++)
            System.out.print(list.get(i));
        }
       
        
    }
}
