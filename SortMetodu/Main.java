package javaders;

import java.util.Arrays;

class MyArr {
	int arr[];
	int length;
	private int[] a;

	public MyArr(int length) { // dizi boyutunu belirle.
		this.length = length;
		arr = new int[this.length];
	}

	public int[] sort() { // dizideki en küçük elemanı bul.
		int min = arr[0];
		a = new int[arr.length];
		int i = -1, count = -1, index = 0;
		while (true) {
			i++;
			if (min > arr[i]) {
				min = arr[i];
				index = i;
			}
			if (i == arr.length - 1 && arr.length > 0) {
				count++;
				a[count] = min;
				remove(index);
				i = -1;
				if (arr.length > 0)
					min = arr[0];
				index = 0;
			}
			if (arr.length < 1)
				break;
		}
		return a;
	}

	private void remove(int index) { // dizide bulunan en küçük elemanı sil ve yeni diziyi tekrardan aynı diziye referansla
		int[] arr2 = new int[arr.length - 1];
		for (int i = 0; i < arr.length; i++) {
			if (index > i) {
				arr2[i] = arr[i];
			}
			if (index < i) {
				arr2[i - 1] = arr[i];
			}
		}
		arr = arr2;
	}
}

public class Main {

	public static void main(String[] args) {
		MyArr myArr = new MyArr(6);
		myArr.arr[0] = -8;
		myArr.arr[1] = 2;
		myArr.arr[2] = 6;
		myArr.arr[3] = 3;
		myArr.arr[4] = 8;
		myArr.arr[5] = 1;
		System.out.println("Girilen Dizi : " + Arrays.toString(myArr.arr));
		System.out.println("Küçükten Büyüğe Sıralanmış Dizi : " + Arrays.toString(myArr.sort()));
	}

}
