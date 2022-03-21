package javaders;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		int[][] matris = { { 1, 2 }, { 4, 5 }, { 7, 8 }};

		for (int i = 0; i < matris.length; i++) {
			for (int j = 0; j < matris[i].length; j++) {
				System.out.print(matris[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("-----------");
		System.out.println("-----------");
		int[][] transpoze = new int[2][3];
		for (int i = 0; i < matris.length; i++) {
			transpoze[0][i] = matris[i][0];
		}

		for (int j = 0; j < matris.length; j++) {
			transpoze[1][j] = matris[j][1];
		}

		for (int i = 0; i < transpoze.length; i++) {
			for (int j = 0; j < transpoze[i].length; j++) {
				System.out.print(transpoze[i][j] + " ");
			}
			System.out.println();
		}
	}

}
