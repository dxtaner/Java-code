package oop;

public class araba {

	private String renk;
	private String model;
	private int tekerlekler;
	private int kapilar;
	

	public String getRenk() {
		return renk;
	}

	public void setRenk(String renk) {
		this.renk = renk;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getTekerlekler() {
		return tekerlekler;
	}

	public void setTekerlekler(int tekerlekler) {
		if(tekerlekler<0){
			System.out.println("tekerlek degeri eksi olamaz");
		}
		else {
			this.tekerlekler=tekerlekler;
		}
	}

	public int getKapilar() {
		return kapilar;
	}

	public void setKapilar(int kapilar) {
		if(kapilar<0){
			System.out.println("kapý degeri eksi olamaz");
		}
		else {
			this.kapilar=kapilar;
		}
	}
	
}
