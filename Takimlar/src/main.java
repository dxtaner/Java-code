import java.util.Scanner;

public class main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Kaç takým girilecek :");
		int takimsayisi = sc.nextInt();

		Takim[] takimlar = new Takim[takimsayisi];

		for (int i = 0; i < takimsayisi; i++) {
			sc.nextLine();
			takimlar[i] = new Takim();
			System.out.print("Takým adý girin :");
			String takimAdi = sc.nextLine();
			takimlar[i].setTakimAdi(takimAdi);
			System.out.print("Attýðý gol :");
			int attigiGol = sc.nextInt();
			takimlar[i].setAttigiGol(attigiGol);
			System.out.print("Yediði gol :");
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
		System.out.println("En yüksek averajlý takým adý:"
				+ takimlar[index].getTakimAdi() + " Attýðý gol :"
				+ takimlar[index].getAttigiGol() + " Yediði gol :"
				+ takimlar[index].getYedigiGol() + " Averajý:" + averaj);
	}

}
