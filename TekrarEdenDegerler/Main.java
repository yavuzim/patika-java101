package javaders;

import java.util.Arrays;

class MyArr {
	int arr[];
	int length;

	public MyArr(int length) { // dizi boyutunu belirle.
		this.length = length;
		arr = new int[this.length];
	}

	public void repeat() { // Tekrar eden sayıyı bul.
		int repeat = 0;
		String indis = "";
		int i = -1, j = -1;
		if (arr.length > 0)
			while (true) { // i indisi
				i++; 
				if (i == arr.length)
					break;
				while (true) { // j indisi
					j++; 
					if (j == arr.length)
						break;
					if (arr[i] == arr[j]) {
						repeat++; // Tekrar sayısı
						indis += j; // Tekrar eden sayının indisleri
					}
				}
				int number = arr[i];
				remove(indis, repeat);
				System.out.println(number + " sayısı : " + repeat + " kere tekrar edildi");
				repeat = 0;
				indis = "";
				i = -1;
				j = -1;
			}
	}

	private void remove(String indis, int repeat) {
		int[] arr2;
		arr2 = new int[arr.length - repeat];
		int startIndex = -1;
		for (int i = 0; i < arr.length; i++) {
			if (search(i, indis)) { // Bulunan ilk tekrar eden sayı hariç diğer sayıları arr2 dizisine aktar
				startIndex++; 
				arr2[startIndex] = arr[i]; 
			}
		}
		arr = arr2; 
	}

	private boolean search(int a, String indis) { 
		boolean control = true;
		for (int i = 0; i < indis.length(); i++) {
			String x = Character.toString(indis.charAt(i));
			if (a == Integer.parseInt(x)) { // indis kontrolü
				control = false;
				break;
			}
		}
		return control;
	}

}

public class Main {

	public static void main(String[] args) {
		MyArr myArr = new MyArr(12);
		myArr.arr[0] = 10;
		myArr.arr[1] = 10;
		myArr.arr[2] = 20;
		myArr.arr[3] = 10;
		myArr.arr[4] = 10;
		myArr.arr[5] = 20;
		myArr.arr[6] = 5;
		myArr.arr[7] = 20;
		myArr.arr[8] = 20;
		myArr.arr[9] = 20;
		myArr.arr[10] = 20;
		myArr.arr[11] = 20;
		System.out.println("Dizi : "+Arrays.toString(myArr.arr));
		myArr.repeat();
	}

}
