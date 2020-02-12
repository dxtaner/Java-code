public class Yonetici extends Calisan {

	private int sorumluKisisayýsý;

	public Yonetici(String ad, String soyad, String iD, int sorumluKisisayisi) {
		super(ad, soyad, iD);
		this.sorumluKisisayýsý = sorumluKisisayisi;
	}

	public void bilgleriGoster() {
		super.bilgleriGoster();
		System.out.println("Yöneticinin sorumlu kiþi sayisi :"
				+ sorumluKisisayýsý);
	}

	public void zamYap(int zam){
		System.out.println(getAd()+" çalýþanlara "+zam+" tl zam yapýyor.");
	}
}
