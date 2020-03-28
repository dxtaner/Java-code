// kapsulleme avantajı --->> private korumalı

public class GelismisAbone {

	private String isim;
	private int bakiye = 120;
	private String sehir;

	public GelismisAbone(String isim, int bakiye, String sehir) {
		this.isim = isim;

		if (bakiye >= 0 && bakiye <= 120) {
			this.bakiye = bakiye;
		}
		this.sehir = sehir;
	}

	public void dogalgazKullan(int miktar) {

		if (this.bakiye < miktar) {
			System.out.println("Yeterli bakiye yokk..");
		} else {
			bakiye -= miktar;

			if (bakiye < 0) {
				System.out.println("Bakiyeniz bitti . Kredi Yukleyin.."
						+ "(Kredi limiti 120 Tl dir.");
			} else {
				System.out.println("Yeni bakiye :" + bakiye);
			}
		}
	}

	public void bakiyeOgren() {
		System.out.println("Bakiye :" + bakiye);
	}

	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	public int getBakiye() {
		return bakiye;
	}

	public void setBakiye(int bakiye) {
		this.bakiye = bakiye;
	}

	public String getSehir() {
		return sehir;
	}

	public void setSehir(String sehir) {
		this.sehir = sehir;
	}
}
