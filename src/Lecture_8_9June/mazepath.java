package Lecture_8_9June;

import java.util.ArrayList;
import java.util.Scanner;

public class mazepath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			int cc = sc.nextInt();
			int cr = sc.nextInt();
			int ec = sc.nextInt();
			int er = sc.nextInt();
			ArrayList<String> list = maze(cc,cr,ec,er);
			System.out.println(list);
			System.out.println(list.size());
			ArrayList<String> listd = mazeD(cc,cr,ec,er);
			System.out.println(listd);
			System.out.println(listd.size());
			ArrayList<String> listdm = mazeDm(cc,cr,ec,er);
			System.out.println(listdm);
			System.out.println(listdm.size());
	}

	public static ArrayList<String> maze(int cc,int cr,int ec,int er){
		
	
		if(cr==er&&cc==ec) {
			ArrayList<String> br = new ArrayList<>();
			br.add("");
			return br;
		}
		if(cc>ec)
		{
			ArrayList<String> br = new ArrayList<>();
			return br;
		}
		if(cr>er)
		{
			ArrayList<String> br = new ArrayList<>();
			return br;
		}

		
		
		ArrayList <String> mr = new ArrayList<>();
	
		ArrayList<String> rr = maze(cc+1,cr,ec,er);
		for(String s:rr)
			mr.add('H'+s);
		
		ArrayList<String> rv = maze(cc,cr+1,ec,er);
		for(String s:rv)
			mr.add('V'+s);
		
 	
		
		return mr;
	
										
	}
	public static ArrayList<String> mazeD(int cc,int cr,int ec,int er){
		
		
		if(cr==er&&cc==ec) {
			ArrayList<String> br = new ArrayList<>();
			br.add("");
			return br;
		}
//		
		if(cr>er||cc>ec)
		{
			ArrayList<String> br = new ArrayList<>();
			return br;
		}
//	
		
		
		ArrayList <String> mr = new ArrayList<>();
	
		ArrayList<String> rr = maze(cc+1,cr,ec,er);
		for(String s:rr)
			mr.add('H'+s);
		
		ArrayList<String> rv = maze(cc,cr+1,ec,er);
		for(String s:rv)
			mr.add('V'+s);
		ArrayList<String> rd = maze(cc+1,cr+1,ec,er);
		for(String s:rd)
			mr.add('D'+s);
		
 	
		
		return mr;
	
										
	}
public static ArrayList<String> mazeDm(int cc,int cr,int ec,int er){
		
		
		if(cr==er&&cc==ec) {
			ArrayList<String> br = new ArrayList<>();
			br.add("");
			return br;
		}
//		
		if(cr>er||cc>ec)
		{
			ArrayList<String> br = new ArrayList<>();
			return br;
		}
		ArrayList <String> mr = new ArrayList<>();
	for(int i=1;i<=er;i++) {
		ArrayList<String> rr = mazeDm(cc+i,cr,ec,er);
		for(String s:rr)
			mr.add("H"+i+s);}
	for(int i=1;i<=ec;i++) {
		ArrayList<String> rv = mazeDm(cc,cr+i,ec,er);
		for(String s:rv)
			mr.add("V"+i+s);}
	for(int i=1;i<=er&&i<=ec;i++) {
		ArrayList<String> rd = mazeDm(cc+i,cr+i,ec,er);
		for(String s:rd)
			mr.add("D"+i+s);}
		
 	
		
		return mr;
	
										
	}
}
k