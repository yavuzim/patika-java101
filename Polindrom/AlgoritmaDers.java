package java101;

import java.util.*;

public class AlgoritmaDers {
	static boolean palindrom(int n) {
		String stringSayi = Integer.toString(n);
		String a = "";
		for (int i = stringSayi.length()-1; i > -1; i--)
			a += stringSayi.charAt(i);
		int intSayi = Integer.parseInt(a);
		if (intSayi == n)
			return true;
		return false;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Number : ");
		int n = in.nextInt();
		String state = "";
		boolean polindrom = palindrom(n);
		if (polindrom)
			state = n + " Sayısı Polindrom Sayıdır!";
		else
			state = n + " Sayısı Polindrom Sayı Değildir!";
		System.out.println(state);
	}

}
