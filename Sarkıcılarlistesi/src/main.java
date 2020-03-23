import java.util.Scanner;

public class main {

	private static Sarkicilar sarkicilar = new Sarkicilar();
	private static Scanner sc = new Scanner(System.in);

	public static void islemleriBastir() {
		System.out.println("\t0-��lemleri G�r�nt�le ");
		System.out.println("\t1-�ark�c�lar� G�r�nt�le ");
		System.out.println("\t2-�ark�c� Ekle ");
		System.out.println("\t3-�ark�c� G�ncelle  ");
		System.out.println("\t4-�ark�c� Sil ");
		System.out.println("\t5-�ark�c� Ara ");
		System.out.println("\t6-Uygulamadan ��k ");
	}

	public static void sarkiciGoruntule() {
		sarkicilar.sarkicilariBastir();
	}

	public static void sarkiciEkle() {
		System.out.print("�arkc� ismi girin:");
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
		System.out.println("Aramak istedi�iniz �ark�c� :");
		String isim = sc.nextLine();
		sarkicilar.sarkiciAra(isim);
	}

	public static void main(String[] args) {

		System.out.println("/////////�ark�c� Uygulamas�////////");
		islemleriBastir();
		boolean cikis = false;
		int islem;

		while (!cikis) {
			System.out.print("��lem Se�in:");
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
				System.out.println("Uygulamadan ��k�l�yor");
			} else {
				System.out.println("....Ge�ersiz i�lem...");
			}
		}
	}
}
