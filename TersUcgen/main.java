package java101;

import java.util.*;

public class main {

	public static void main(String[] args) {
		for (int i = 1; i<=8; i++) {
			for (int j = 0; j <= (i); j++)
				System.out.print(" ");
			for (int k = 1; k <=2*(8-i)-1; k++)
					System.out.print("*");
			System.out.println();
		}
	}
}
