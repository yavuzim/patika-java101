package java101;

public class main {

	public static void main(String[] args) {
		int x = 6;
		for (int i = 0; i < x; i++) {
			for (int j = 1; j < (x - i); j++) {
				System.out.print(" ");
			}
			for (int k = 0; k < (i * 2 + 1); k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = x; i > 1; i--) {
			for (int j = 1; j < (x - i + 2); j++) {
				System.out.print(" ");
			}
			for (int k = 0; k < (i * 2 - 3); k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
