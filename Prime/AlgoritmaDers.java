package java101;

import java.util.*;

public class AlgoritmaDers {

	static boolean prime(int a) {
		boolean control = true;
		if (a == 2)
			return control;
		if (a < 2)
			return false;
		for (int i = 2; i < a; i++) {
			if (a % i == 0) {
				control = false;
				break;
			}
		}
		return control;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Number : ");
		int n = in.nextInt();

		if (prime(n))
			System.out.println(n + " sayısı asaldır");
		else
			System.out.println(n + " sayısı asal değildir");

	}

}
