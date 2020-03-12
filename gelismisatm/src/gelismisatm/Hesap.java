package gelismisatm;

public class Hesap {
	private String kullaniciAdi;
	private String sifre;
	private int bakiye;

	public Hesap(String kullaniciAdi, String sifre, int bakiye) {

		this.kullaniciAdi = kullaniciAdi;
		this.sifre = sifre;
		this.bakiye = bakiye;

	}

	public void paraYatir(int tutar){
		this.bakiye+=tutar;
		System.out.println("Bakiye :"+bakiye);
	}
	public void paraCek(int tutar){
		if(tutar>bakiye){
			System.out.println("Bakiyeniz Eksik");
		}
		else {
			this.bakiye-=tutar;
			System.out.println("Bakiye :"+bakiye);
		}
	}
	
	
	public String getKullaniciAdi() {
		return kullaniciAdi;
	}

	public void setKullaniciAdi(String kullaniciAdi) {
		this.kullaniciAdi = kullaniciAdi;
	}

	public String getSifre() {
		return sifre;
	}

	public void setSifre(String sifre) {
		this.sifre = sifre;
	}

	public int getBakiye() {
		return bakiye;
	}

	public void setBakiye(int bakiye) {
		this.bakiye = bakiye;
	}

}
