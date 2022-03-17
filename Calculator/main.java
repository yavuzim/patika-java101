package java101;

import java.util.*;

public class AlgoritmaDers {
	static void plus(int a, int b) {
		System.out.println(a + " + " + b + " = " + (a + b));
	}

	static void difference(int a, int b) {
		System.out.println(a + " - " + b + " = " + (a - b));
	}

	static void multip(int a, int b) {
		System.out.println(a + " x " + b + " = " + (a * b));
	}

	static void divide(double a, double b) {
		System.out.println(a + " / " + b + " = " + (a / b));
	}

	static void pow(double a, double b) {
		int multip = 1;
		for (int i = 0; i < b; i++) {
			multip *= a;
		}
		System.out.println(a + "^" + b + " = " + multip);
	}

	static void factorial(int a) {
		int multip = 1;
		for (int i = 2; i <= a; i++) {
			multip *= i;
		}
		System.out.println(a + "! = " + multip);
	}

	static void mod(int a) {
		System.out.println("|" + a + "| = " + (-a * (-2) - a));
	}

	static void area(int a, int b) {
		System.out.println("Alan : " + (a * b));
	}

	static void perimeter(int a, int b) {
		System.out.println("Çevre : " + (2 * a + 2 * b));
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String menu = "\n1- Toplama İşlemi\n" + "2- Çıkarma İşlemi\n" + "3- Çarpma İşlemi\n" + "4- Bölme işlemi\n"
				+ "5- Üslü Sayı Hesaplama\n" + "6- Faktoriyel Hesaplama\n" + "7- Mod Alma\n" + "8- Dikdörtgen Alan\n"
				+ "9- Çevre Hesabı\n" + "0- Çıkış Yap";
		int select = -1;
		while (select < 0 || select > 9) {
			System.out.println(menu);
			System.out.print("Hesapla : ");
			select = in.nextInt();
			if (select == 0) {
				System.out.println("Çıkış Yapıldı!");
				break;
			}
			switch (select) {
			case 1: {
				System.out.print("Sayı 1 : ");
				int s1 = in.nextInt();
				System.out.print("Sayı 2 : ");
				int s2 = in.nextInt();
				plus(s1, s2);
				break;
			}
			case 2: {
				System.out.print("Sayı 1 : ");
				int s1 = in.nextInt();
				System.out.print("Sayı 2 : ");
				int s2 = in.nextInt();
				difference(s1, s2);
				break;
			}
			case 3: {
				System.out.print("Sayı 1 : ");
				int s1 = in.nextInt();
				System.out.print("Sayı 2 : ");
				int s2 = in.nextInt();
				multip(s1, s2);
				break;
			}
			case 4: {
				System.out.print("Sayı 1 : ");
				double s1 = in.nextDouble();
				System.out.print("Sayı 2 : ");
				double s2 = in.nextDouble();
				divide(s1, s2);
				break;
			}
			case 5: {
				System.out.print("Sayı : ");
				double s1 = in.nextDouble();
				System.out.print("Üs : ");
				double s2 = in.nextDouble();
				pow(s1, s2);
				break;
			}
			case 6: {
				System.out.print("Sayı: ");
				int s1 = in.nextInt();
				factorial(s1);
				break;
			}
			case 7: {
				System.out.print("Sayı: ");
				int s1 = in.nextInt();
				mod(s1);
				break;
			}
			case 8: {
				System.out.print("Kısa Kenar: ");
				int a = in.nextInt();
				System.out.print("Uzun Kenar: ");
				int b = in.nextInt();
				area(a, b);
				break;
			}
			case 9: {
				System.out.print("Kısa Kenar: ");
				int a = in.nextInt();
				System.out.print("Uzun Kenar: ");
				int b = in.nextInt();
				perimeter(a, b);
				break;
			}
			default:
				System.out.print("Hatalı Değer!!!");
				break;
			}
		}
	}

}
