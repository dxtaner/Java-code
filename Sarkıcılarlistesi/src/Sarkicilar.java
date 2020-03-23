import java.util.ArrayList;

public class Sarkicilar {
	private ArrayList<String> sarkiciListesi = new ArrayList<String>();

	public void sarkicilariBastir() {
		System.out.println("�arkici listesinde " + sarkiciListesi.size()
				+ " �ark�c� var");
		for (int i = 0; i < sarkiciListesi.size(); i++) {

			System.out.println(i+1 + " �ark�c� : " + sarkiciListesi.get(i));
		}
		
	}

	public void sarkiciEkle(String isim) {
		sarkiciListesi.add(isim);
		System.out.println(isim + " adl� �ark�c� listeye eklendi. ");
	}

	public void sarkiciGuncelle(String yeniisim, int pozisyon) {
		sarkiciListesi.set(pozisyon, yeniisim);
		System.out.println("�ark�c� listesi guncellendi");
	}

	public void sarkiciSil(int pozisyon) {
		String isim = sarkiciListesi.get(pozisyon);
		sarkiciListesi.remove(pozisyon);
		System.out.println(isim + " adl� �ark�c� listeden silindi");
	}

	public void sarkiciAra(String isim) {
		int pozisyon = sarkiciListesi.indexOf(isim);
		if (pozisyon >= 0) {
			System.out.println("�ark�c� bulundu\n " + isim + " adl� �ark�c� "
					+ (pozisyon+1) + " pozisyonda bulundu");
		} else {
			System.out.println("�ark�c� bulunamad�....");
		}
	}
}
