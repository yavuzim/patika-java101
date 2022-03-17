package java101;

import java.util.*;

public class AlgoritmaDers {

	static void pattern(int a) {
		if (a<=0) {
			System.out.println(a);
			return;
		}
		System.out.println(a);
		pattern(a - 5);
		System.out.println(a);
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int a;

		System.out.print("Enter a num: ");
		a = input.nextInt();

		pattern(a);
	}

}
