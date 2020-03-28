public class main {

	public static void main(String[] args) {

		/*
		 * Abone abone = new Abone();
		 * 
		 * abone.isim="taner özer"; abone.bakiye=200; //abone.sehir="Bursa";
		 * 
		 * abone.dogalgazKullan(200);
		 */
		
		GelismisAbone abone = new GelismisAbone("Taner Özer",200,"Bursa");
		
		abone.bakiyeOgren();
		abone.dogalgazKullan(50);
		abone.bakiyeOgren();
		abone.dogalgazKullan(85);
		abone.bakiyeOgren();
		abone.dogalgazKullan(45);
	}

}
