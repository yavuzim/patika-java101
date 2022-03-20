package java101;

import java.util.*;

public class Main {

	static boolean search(int n, int[] arr) {
		boolean control = true;
		for (int i = 0; i < arr.length; i++) {
			if (n == arr[i])
				control = false;
		}
		return control;
	}

	public static void main(String[] args) {
		int[] arr = { 3, 5, 3, 3, 6, 6, 9, 8, 8, 9, 12, 3,1,2,6,9,55,55,69,55};
		int[] repeat = new int[arr.length];
		int count = -1;
		for (int i = 0; i < arr.length; i++) {
			boolean control = false;
			for (int j = 0; j < arr.length; j++) {
				if (i != j && arr[i] == arr[j]) {
					control = true;
				}
			}
			if (control && search(arr[i], repeat)) {
				count++;
				repeat[count] = arr[i];
			}
			control = false;
		}
		System.out.print(Arrays.toString(arr)+ " => Dizisinde Tekrar Eden Sayılar : ");
		for (int i : repeat) {
			if (i != 0)
				System.out.print(i+" ");
		}

	}
}
