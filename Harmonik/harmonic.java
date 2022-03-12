package javaProg;

import java.util.*;
import java.math.*;

public class JavaConsole {
	public static double harmonic(int n) {
		double sum=0.0;
		for(double i=1; i<=n; i++) {
			sum+=1/i;
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Number : ");
		int number = s.nextInt();
		System.out.println(harmonic(number));
	}

}
