package java101;

import java.util.*;

public class AlgoritmaDers {

	static int pow(double a, double b) {
		int multip = 1;
		for (int i = 0; i < b; i++) {
			multip *= a;
		}
		return multip;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Floor : ");
		int floor = in.nextInt();
		System.out.print("Power : ");
		int pw = in.nextInt();

		System.out.println(floor + "^" + pw + " = " + pow(floor, pw));

	}

}
