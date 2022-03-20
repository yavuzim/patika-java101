package java101;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		int[][] m = new int[9][8];

		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				if (i == 0 || i == 4 || i == 8)
					System.out.print("*");
				else if (j == 0 || j == 7)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}
