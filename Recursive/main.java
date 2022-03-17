package java101;

import java.util.*;

public class AlgoritmaDers {
	static int fibonacci(int n) {
		if (n == 1 || n == 2)
			return 1;
		int a = fibonacci(n - 1) + fibonacci(n - 2);
		return a;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Number : ");
		int n = in.nextInt();
		// System.out.print(1 + " " + 1+" ");
		for (int i = 2; i <= n; i++) {
			System.out.print(fibonacci(i) + " ");
		}
	}

}
