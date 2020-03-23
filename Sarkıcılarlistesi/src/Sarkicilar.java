import java.util.ArrayList;

public class Sarkicilar {
	private ArrayList<String> sarkiciListesi = new ArrayList<String>();

	public void sarkicilariBastir() {
		System.out.println("Þarkici listesinde " + sarkiciListesi.size()
				+ " þarkýcý var");
		for (int i = 0; i < sarkiciListesi.size(); i++) {

			System.out.println(i+1 + " Þarkýcý : " + sarkiciListesi.get(i));
		}
		
	}

	public void sarkiciEkle(String isim) {
		sarkiciListesi.add(isim);
		System.out.println(isim + " adlý þarkýcý listeye eklendi. ");
	}

	public void sarkiciGuncelle(String yeniisim, int pozisyon) {
		sarkiciListesi.set(pozisyon, yeniisim);
		System.out.println("Þarkýcý listesi guncellendi");
	}

	public void sarkiciSil(int pozisyon) {
		String isim = sarkiciListesi.get(pozisyon);
		sarkiciListesi.remove(pozisyon);
		System.out.println(isim + " adlý þarkýcý listeden silindi");
	}

	public void sarkiciAra(String isim) {
		int pozisyon = sarkiciListesi.indexOf(isim);
		if (pozisyon >= 0) {
			System.out.println("Þarkýcý bulundu\n " + isim + " adlý þarkýcý "
					+ (pozisyon+1) + " pozisyonda bulundu");
		} else {
			System.out.println("Þarkýcý bulunamadý....");
		}
	}
}
