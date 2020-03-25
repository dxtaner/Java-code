public class test {

	public static void main(String[] args) {
		// has - a composition 
		
		Resolution resolution = new Resolution(1920,1080);
		Monitor monitor = new Monitor("Vs197da","Asus","18.5", resolution);
		Kasa kasa = new Kasa("ShadowBlade","Shadow", "Tamperli Cam");
		Anakart anakart = new Anakart("b250","Asus",10,"Windows 10");
		Bilgisayar pc = new Bilgisayar(monitor, kasa, anakart);
		pc.getKasa().bilgisayariAc();
		pc.getMonitor().monitoruKapat();
		pc.getAnakart().yuvaSayisiArttir(5);
		pc.getAnakart().isletimSistemiYukle("Ubuntu 7.24");
		pc.getMonitor().oyunAc();
		pc.getKasa().bilgisayariKapat();
		pc.getMonitor().monitoruKapat();
		
	}
}
