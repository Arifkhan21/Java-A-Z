package Assignment_hckrBlcks;


import java.util.*;
public class codesofString {
    public static void main(String args[]) {
        // Your Code Here
        
        Scanner sc = new Scanner(System.in);
        String str = "1125";
        System.out.println(func(str,""));
    }
    
    public static ArrayList<String> func(String str,String ans){
        
        
        if(str.length()==0){
            ArrayList<String> list = new ArrayList<>();
            list.add("");
            return list;
        }
        
        if(ans.length()>2){
             ArrayList<String> list = new ArrayList<>();
            return list;
        }
      
        ArrayList<String> mr = new ArrayList<>();
        
        for(int i=0;i<str.length();i++){
        String a= str.substring(0,i+1);
        
         String res = str.substring(i+1);
        int x=Integer.parseInt(a)+96;
         
        ArrayList<String> rr = func(res,a);
        
        for(String ss: rr)
        mr.add((char)(x)+ss);
        }
        return mr;
    }
}
