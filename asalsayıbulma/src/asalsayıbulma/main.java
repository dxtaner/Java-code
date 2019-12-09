package asalsayýbulma;

import java.util.Scanner;

public class main {

	public static boolean asalmi(int sayi) {

		for (int i = 2; i < sayi / 2; i++) {

			if (sayi % i == 0) {

				return false;
			}

		}
		return true;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("Bir Sayi Girin :");
			int sayi = sc.nextInt();

			if (sayi < 0) {
				System.out.println(sayi + " negatif sayidir"
						+ ".Lüften pozitif girin...");
			} else if (asalmi(sayi)) {
				System.out.println(sayi + " asal sayidir.");
			} else {
				System.out.println(sayi + " asal sayi deðildir. ");

			}
		}
	}
}