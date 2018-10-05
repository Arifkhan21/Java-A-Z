package Assignment_hckrBlcks;

import java.util.*;

public class alpha {
	public static void main(String args[]) {
		// Your Code Here
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] arr = new long[n];
		for (int i = 0; i < n; i++)
			arr[i] = sc.nextLong();

		long[] as = new long[n];
		
		for (int i = 1; i < n; i++) {

			as[i] = alphac(arr, i, arr[i]);

		}
		long sum = 0;
		for (long i : as)
			sum += i;

		sum = sum % (int) (Math.pow(10, 9) + 7);
		System.out.println(sum);
	}

	public static long alphac(long[] arr, int in, long val) {
		long sum = 0;
		for (int i = 0; i < in; i++) {
			if (arr[i] < val)
				sum = sum + arr[i];
		}
		return sum;
	}
}
