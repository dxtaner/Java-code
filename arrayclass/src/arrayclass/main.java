package arrayclass;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		int sayi;
		System.out.print("Kaç kiþi giriceksininz :");
		sayi=sc.nextInt();
		
		Ogrenci[] ogrenciler= new Ogrenci[sayi];
		
		for (int i = 0; i < ogrenciler.length; i++) {
			ogrenciler[i]=new Ogrenci();
			ogrenciler[i].setNumber(1001+i);
			System.out.print("ad :");
			ogrenciler[i].setAd(sc.next());
			System.out.print("soyad :");
			ogrenciler[i].setSoyad(sc.next());
			ogrenciler[i].setBolum("Bilgisayar Muhendisliði");
			
		}
		for (int i = 0; i < ogrenciler.length; i++) {
			ogrenciler[i].goruntule();
		}
	}

}
