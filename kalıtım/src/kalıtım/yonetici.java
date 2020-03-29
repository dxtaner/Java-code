package kalýtým;

public class yonetici extends Calisan { // subclass
	private int sorumluKisisayisi; // Ektra Özellik

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
		System.out.println("Çalýsanlara " + zam + " tl zam yapýldý.");
	}

	public void bilgileriGoster() {
		/*
		 * System.out.println("isim :" + getIsim()); System.out.println("maas :"
		 * + getMaas()); System.out.println("departman :" + getDepartman());
		 */
		super.bilgileriGoster();
		System.out.println("sorumlu kiþi sayýsý :" + sorumluKisisayisi);
	}
}
