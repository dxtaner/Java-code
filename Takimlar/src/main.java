import java.util.Scanner;

public class main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Ka� tak�m girilecek :");
		int takimsayisi = sc.nextInt();

		Takim[] takimlar = new Takim[takimsayisi];

		for (int i = 0; i < takimsayisi; i++) {
			sc.nextLine();
			takimlar[i] = new Takim();
			System.out.print("Tak�m ad� girin :");
			String takimAdi = sc.nextLine();
			takimlar[i].setTakimAdi(takimAdi);
			System.out.print("Att��� gol :");
			int attigiGol = sc.nextInt();
			takimlar[i].setAttigiGol(attigiGol);
			System.out.print("Yedi�i gol :");
			int yedigiGol = sc.nextInt();
			takimlar[i].setYedigiGol(yedigiGol);
		}
		System.out.println("-------------TAKIMLAR----------------");
		for (int i = 0; i < takimlar.length; i++) {
			takimlar[i].goruntule();
		}

		int index = 0;
		int averaj = 0;
		for (int i = 0; i < takimlar.length; i++) {
			if (takimlar[i].averajHesapla() > averaj) {
				averaj = takimlar[i].averajHesapla();
				index = i;
			}
		}
		System.out.println("--------------------------");
		System.out.println("En y�ksek averajl� tak�m ad�:"
				+ takimlar[index].getTakimAdi() + " Att��� gol :"
				+ takimlar[index].getAttigiGol() + " Yedi�i gol :"
				+ takimlar[index].getYedigiGol() + " Averaj�:" + averaj);
	}

}
