package java101;

import java.util.*;

public class main {
	static void state() {
		System.out.println("1-Para yatırma\n" + "2-Para Çekme\n" + "3-Bakiye Sorgula\n" + "4-Çıkış Yap");
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String password = " ";
		int right = 3;
		double balance = 1500.00;
		System.out.println("**Bankamıza Hoşgeldiniz**");
		while (!password.equals("1234")) {
			System.out.print("Şifre : ");
			password = in.nextLine();
			if (!password.equals("1234")) {
				right--;
				if (right > 0)
					System.out.println(right + " hakkınız kalmıştır!");

				if (right == 0) {
					System.out.println("Kartınız Bloke Olmuştur!");
					break;
				}
			} else {
				System.out.println("Giriş Yapıldı");
				System.out.println("********************");
				int select = 0;
				state();
				do {
					if (select < 1 || select > 4) {
						System.out.println("********************");
						System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz : ");
						select = in.nextInt();
					}
					switch (select) {
					case 1: {
						System.out.println(".........................");
						System.out.print(

								"Bankanızdaki Para Miktarı : " + balance + "\n" + "Yatırılacak Para : ");
						double prince = in.nextDouble();
						balance += prince;
						select = 0;
						break;
					}
					case 2: {
						System.out.println(".........................");
						System.out.print("Bankanızdaki Para Miktarı : " + balance + "\n" + "Çekilecek Para : ");
						double prince = in.nextDouble();
						if (prince > balance) {
							System.out.println("Girilen Miktar Geçersiz Bakiye");
							select = 0;
						} else {
							balance -= prince;
							select = 0;
						}
						break;
					}
					case 3: {
						System.out.println(".........................");
						System.out.println("Bankanızdaki Para : " + balance + " TL");
						select = 0;
						break;
					}
					case 4: {
						System.out.println(".........................");
						System.out.println("Çıkış Yapıldı");
						break;
					}
					default:
						System.out.println("Geçersiz Değer");
						break;
					}
				} while (select < 1 || select > 4);

			}

		}
	}

}
