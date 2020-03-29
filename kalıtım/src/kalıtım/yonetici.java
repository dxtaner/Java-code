package kal�t�m;

public class yonetici extends Calisan { // subclass
	private int sorumluKisisayisi; // Ektra �zellik

	public yonetici(String isim, int maas, String departman,
			int sorumluKisisayisi) 
	{
		/*
		 * this.isim=isim; this.maas=maas; this.departman=departman;
		 */
		super(isim, maas, departman); // super methodu getiriyor 
		this.sorumluKisisayisi = sorumluKisisayisi;
	}

	public void zamYap(int zam) {
		System.out.println("�al�sanlara " + zam + " tl zam yap�ld�.");
	}

	public void bilgileriGoster() {
		/*
		 * System.out.println("isim :" + getIsim()); System.out.println("maas :"
		 * + getMaas()); System.out.println("departman :" + getDepartman());
		 */
		super.bilgileriGoster();
		System.out.println("sorumlu ki�i say�s� :" + sorumluKisisayisi);
	}
}
