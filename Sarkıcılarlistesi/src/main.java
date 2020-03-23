import java.util.Scanner;

public class main {

	private static Sarkicilar sarkicilar = new Sarkicilar();
	private static Scanner sc = new Scanner(System.in);

	public static void islemleriBastir() {
		System.out.println("\t0-Ýþlemleri Görüntüle ");
		System.out.println("\t1-Þarkýcýlarý Görüntüle ");
		System.out.println("\t2-Þarkýcý Ekle ");
		System.out.println("\t3-Þarkýcý Güncelle  ");
		System.out.println("\t4-Þarkýcý Sil ");
		System.out.println("\t5-Þarkýcý Ara ");
		System.out.println("\t6-Uygulamadan Çýk ");
	}

	public static void sarkiciGoruntule() {
		sarkicilar.sarkicilariBastir();
	}

	public static void sarkiciEkle() {
		System.out.print("Þarkcý ismi girin:");
		String isim = sc.nextLine();
		sarkicilar.sarkiciEkle(isim);
	}

	public static void sarkiciGuncelle() {
		System.out.print("Pozisyonu girin:");
		int pozisyon = sc.nextInt();
		sc.nextLine();
		String yeniisim = sc.nextLine();
		sarkicilar.sarkiciGuncelle(yeniisim, pozisyon - 1);
	}

	public static void sarkiciSil() {
		System.out.print("Pozisyonu girin:");
		int pozisyon = sc.nextInt();
		sarkicilar.sarkiciSil(pozisyon - 1);

	}

	public static void sarkiciAra() {
		System.out.println("Aramak istediðiniz þarkýcý :");
		String isim = sc.nextLine();
		sarkicilar.sarkiciAra(isim);
	}

	public static void main(String[] args) {

		System.out.println("/////////Þarkýcý Uygulamasý////////");
		islemleriBastir();
		boolean cikis = false;
		int islem;

		while (!cikis) {
			System.out.print("Ýþlem Seçin:");
			islem = sc.nextInt();
			sc.nextLine();

			if (islem == 0) {
				islemleriBastir();
			} else if (islem == 1) {
				sarkiciGoruntule();
			} else if (islem == 2) {
				sarkiciEkle();
			} else if (islem == 3) {
				sarkiciGuncelle();
			} else if (islem == 4) {
				sarkiciSil();
			} else if (islem == 5) {
				sarkiciAra();
			} else if (islem == 6) {
				cikis = true;
				System.out.println("Uygulamadan Çýkýlýyor");
			} else {
				System.out.println("....Geçersiz iþlem...");
			}
		}
	}
}
