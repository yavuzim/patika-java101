package java101;

import java.util.*;

public class main {

	public static void main(String[] args) {
		int asal = 0, sayac = 0, a = 0;
		for (int i = 2; i < 100; i++) {
			for (int j = 2; j < 100; j++)
				if (i % j == 0)
					sayac++;
			if (sayac < 2)
				System.out.print(i + " ");
			sayac = 0;
		}
	}
}
