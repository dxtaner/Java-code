package armstrongsayi;

//dxtaner 
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		/*
		 * armstrongsayi T�m basamaklar�ndaki rakamlar�n say� de�erlerinin
		 * k�pleri toplam�, kendisine e�it olan say�lara "Armstrong say�"denir.
		 * �rne�in; 371=33+73+13=27+343+1=371
		 */

		Scanner sc = new Scanner(System.in);

		System.out.println("Bir Say� Girin :");
		int sayi = sc.nextInt();

		System.out.println("Basamak Say�s�n� Girin :");
		int basamaksayisi = sc.nextInt();

		int temp = sayi;
		int toplam = 0;

		do {
			int basamakdegeri = temp % 10;
			temp /= 10;

			toplam += Math.pow(basamakdegeri, basamaksayisi);

		} while (temp > 0);

		if (toplam == sayi) {
			System.out.println("Bu Say� Armstrong Say�d�r..");
		} else {
			System.out.println("Bu Say� Armstrong Say� De�ildir..");
		}
	}

}
