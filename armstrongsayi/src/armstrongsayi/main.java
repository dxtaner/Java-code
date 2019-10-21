package armstrongsayi;

//dxtaner 
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		/*
		 * armstrongsayi Tüm basamaklarýndaki rakamlarýn sayý deðerlerinin
		 * küpleri toplamý, kendisine eþit olan sayýlara "Armstrong sayý"denir.
		 * Örneðin; 371=33+73+13=27+343+1=371
		 */

		Scanner sc = new Scanner(System.in);

		System.out.println("Bir Sayý Girin :");
		int sayi = sc.nextInt();

		System.out.println("Basamak Sayýsýný Girin :");
		int basamaksayisi = sc.nextInt();

		int temp = sayi;
		int toplam = 0;

		do {
			int basamakdegeri = temp % 10;
			temp /= 10;

			toplam += Math.pow(basamakdegeri, basamaksayisi);

		} while (temp > 0);

		if (toplam == sayi) {
			System.out.println("Bu Sayý Armstrong Sayýdýr..");
		} else {
			System.out.println("Bu Sayý Armstrong Sayý Deðildir..");
		}
	}

}
