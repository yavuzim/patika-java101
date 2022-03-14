package java101;

import java.util.*;

public class main {

	public static void main(String[] args) {
		int a = 1, b = 1, before = 1, sum = 0;
		System.out.print(a + " " + b + " ");
		for (int i = 0; i < 12; i++) {
			before = a;
			sum = before + b;
			a = sum;
			b = before;
			System.out.print(sum + " ");
		}
	}
}
