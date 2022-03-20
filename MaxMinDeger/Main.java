package java101;

import java.util.*;

class Arr {
	int[] arr;

	public Arr(int length) {
		arr = new int[length];
		for (int i = 0; i < length; i++) {
			double number = Math.random() * 100;
			int n = (int) Math.round(number);
			if (Arrays.binarySearch(arr, n) < 0) {
				arr[i] = n;
			} else
				i--;
		}
		System.out.println(Arrays.toString(arr) + "\n");
	}

	int min(int number) {
		int min = 0, dif = 99, index = -1;
		for (int i = 0; i < arr.length; i++) {
			if (number > arr[i]) {
				min = number - arr[i];
				if (min < dif) {
					dif = min;
					index = i;
				}
			}
		}
		return arr[index];
	}

	int max(int number) { 
		int min = 0, dif = 99, index = -1;
		for (int i = 0; i < arr.length; i++) {
			if (number < arr[i]) {
				min = arr[i] - number;
				if (min < dif) {
					dif = min;
					index = i;
				}
			}
		}
		return arr[index];
	}

	void search(int number) {
		int min = min(number);
		int max = max(number);
		System.out.println("Girilen Sayı : " + number + "\n" + "En Küçük : " + min + "\n" + "En Büyük : " + max);
	}
}

public class Main {

	public static void main(String[] args) {
		Arr arr = new Arr(9);
		arr.search(69);
	}
}
