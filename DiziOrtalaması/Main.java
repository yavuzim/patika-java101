package java101;

import java.util.*;

class Harmonic {
	int[] numbers;
	int length;

	public Harmonic(int length) {
		this.length = length;
		numbers = new int[this.length]; // Dizi uzunluğu belirleme
	}

	void add() {
		for (int i = 0; i < this.numbers.length; i++)
			this.numbers[i] = (i + 1);  // Diziye değer atama
	}

	double sum() {
		add();
		double sum = 0.0;
		for (double i : this.numbers) {
			sum += (1 / i); // 1'i dizinin her indis değerine bölüm toplama
		}
		return sum;
	}

	double avarage() {
		return this.numbers.length / this.sum(); // harmonik ortalama
	}

	String print() {
		return Double.toString(avarage()); // Ekrana yazdırma
	}
}

public class Main {

	public static void main(String[] args) {

		Harmonic hA = new Harmonic(3); // Harmonic hA = new Harmonic(arrays.length);

		System.out.println(hA.print());

	}
}
