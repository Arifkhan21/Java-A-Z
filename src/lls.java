import java.util.*;
public class lls {
    public static void main(String args[]) {
    Scanner sc= new Scanner(System.in);
    int tc= sc.nextInt();
    
//    7 4
//    2 5 -1 7 -3 -1 -2 
    for(int x=0;x<tc;x++){
        int n= sc.nextInt();
        int k= sc.nextInt();
    
        Stack<Integer> st=new Stack<>();
        int[] ans=new int[n-k+1];
        int j=0;
        for(int i=0;i<n;i++)
        st.push(sc.nextInt());
        
        while(st.size()>=k){
            Stack<Integer> help=new Stack<>();
            int max=-1000000,min=1000000;
            
            for(int i=0;i<k;i++){
                int data=st.pop();
                if(data>max)
                max=data;
                if(data<min)
                min=data;
                help.push(data);
            }
            ans[j]=max+min;
            j++;
            for(int i=1;i<k;i++){
                st.push(help.pop());
            }
        
        }int sum=0;
        for(int val:ans)
        sum+=val;
        System.out.println(sum);
    }
    
    }
}