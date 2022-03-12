package javaProg;

import java.util.*;
import java.math.*;

public class JavaConsole {
	public static int armstrong(int number) {
		int digit = digit(number);
		int k, sum = 0;
		while (true) {
			k = number % 10; // 407%10=7, 40%10=0
			number = number / 10; // 407/10=40,40/10=4
			if (number < 10) {
				sum += Math.pow(number, digit) + Math.pow(k, digit);
				break;
			}
			if (number >= 10)
				sum += Math.pow(k, digit);
		}
		return sum;
	}

	public static int digit(int number) {
		int count = 0;
		if(number<10) return count+1;
		while (true) {
			number = number / 10;
			count += 1;
			if (number < 10)
				break;
		}
		return count + 1;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Number : ");
		int number = s.nextInt();
		int armstrong = armstrong(number);
		if (armstrong == number)
			System.out.println(number + " Armstrong Sayıdır");
		else
			System.out.println(number+ " Armstrong Sayı Değildir");
	}

}
