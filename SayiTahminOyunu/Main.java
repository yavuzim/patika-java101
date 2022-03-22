package javaders;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		long number = Math.round(Math.random() * 101);

		Scanner in = new Scanner(System.in);
		int prediction, count = 0;

		while (true) {
			String state = "";
			System.out.print("Tahmin : ");
			prediction = in.nextInt();
			count++;
			if (prediction < number)
				state = "Daha Büyük Sayı Giriniz!";
			else if (prediction > number)
				state = "Daha Küçük Sayı Giriniz!";
			else {
				state = "Tebrikler " + number + " sayısını " + count + " . denemede bildiniz!";
				System.out.println(state);
				break;
			}
			System.out.println(state);
		}

	}

}
