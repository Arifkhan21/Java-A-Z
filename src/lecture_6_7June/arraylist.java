package lecture_6_7June;

import java.util.ArrayList;

public class arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = func("abcd");
		System.out.println(list);

	}

	public static ArrayList<String> func(String str) {

		if (str.length() == 0) {
			ArrayList<String> list = new ArrayList<>();
			list.add("");
			return list;
		}

		char ch = str.charAt(0);
		String res = str.substring(1);

		ArrayList<String> rr = func(res);
		ArrayList<String> mr = new ArrayList<>();

		for (String s : rr) {
		
			mr.add(ch+s);
			mr.add(s);
			
//			mr.add(((int) ch) + s);
		}
		return mr;
	}
}
