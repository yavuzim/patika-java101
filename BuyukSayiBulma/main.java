package java101;

import java.util.*;

public class main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int total, before = 0;
		System.out.print("Total : ");
		total = scan.nextInt();
		for (int i = 1; i <= total; i++) {
			System.out.print("Number "+i+" : ");
			int number = scan.nextInt();
			if (number >= before)
				before = number;
		}
		System.out.println("Girilen En Büyük Sayı : " + before);
	}
}
