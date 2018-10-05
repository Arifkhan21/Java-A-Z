package Assignment_hckrBlcks;
import java.util.Scanner;
public class wildcard {
    public static void main(String args[]) {
        // Your Code Here
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String inp = sc.next();
        int n=inp.length();
        
        boolean flag  = true;
        int i=0,z=0;
       while(i<n){
           
          char ch = inp.charAt(i);
           
           if(ch=='*')
           {
              for(int j=i;j<n;j++)
              {
                  if(inp.charAt(j)!='*'){
                      i=j;
                  break;
                       
                  }
              }
              
           }
           else if(ch=='?'){
               if(i<=str.length()-1)
            {i++;}
               else{
                   flag=false;
                   i=n;
               }
           }
           else{
               boolean mila = false;
               for(z=i;z<n;z++){
               if(str.charAt(z)==inp.charAt(i))
                  i++;
                   mila=true;
                   break;
               }
               if(!mila){
                   flag=false;
                   i=n;
               }
           }
           
        }
        if(flag)
        System.out.println("MATCHED");
        else
        System.out.println("NOT MATCHED");
    }
}
