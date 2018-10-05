package lecture_6_7June;

public class test {
public static void main(String[] args) {
	System.out.println(fun(99));
}
public static int fun(int n) {
	if(n>100)
		return n-10;
	
	return(fun(fun(n+11)));
}
}
