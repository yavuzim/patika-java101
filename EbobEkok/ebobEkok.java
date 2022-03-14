package java101;

import java.util.*;

public class main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n1, n2, count = 1, ebob = 1;
		System.out.print("Number 1 : ");
		n1 = scan.nextInt();
		System.out.print("Number 2 : ");
		n2 = scan.nextInt();

		while (true) {
			count++;
			if (n1 > n2) { // 40 20
				if (n2 % count == 0 && n1 % count == 0) {
					if (ebob <= n2) {
						ebob = count;
					}
				}
			} else {
				if (n2 % count == 0 && n1 % count == 0) {
					if (ebob <= n1) {
						ebob = count;
					}
				}
			}
			if (count == n1 || count == n2)
				break;
		}
		System.out.println("Ebob : " + ebob + "\n" + "Ekok : " + (n1 * n2) / ebob);
	}
}
