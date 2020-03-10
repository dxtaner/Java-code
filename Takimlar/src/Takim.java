public class Takim {
	private String takimAdi;
	private int attigiGol;
	private int yedigiGol;

	public String getTakimAdi() {
		return takimAdi;
	}

	public void setTakimAdi(String takimAdi) {
		this.takimAdi = takimAdi;
	}

	public int getAttigiGol() {
		return attigiGol;
	}

	public void setAttigiGol(int attigiGol) {
		this.attigiGol = attigiGol;
	}

	public int getYedigiGol() {
		return yedigiGol;
	}

	public void setYedigiGol(int yedigiGol) {
		this.yedigiGol = yedigiGol;
	}

	public void goruntule() {
		System.out.println("Takom adý:" + takimAdi + " attýðý gol:"
				+ attigiGol + " yediði gol:" + yedigiGol);
	}

	public int averajHesapla() {
		return this.attigiGol - this.yedigiGol;
	}
}
