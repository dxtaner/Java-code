public class recapDemo1 {

	public static void main(String[] args) {
		int sayi1=20;
		int sayi2=25;
		int sayi3=22;
		int enBuyukSayi=sayi1;
		
		if(enBuyukSayi<sayi2) {
			enBuyukSayi = sayi2;
		}
		
		if(enBuyukSayi<sayi3) {
			enBuyukSayi = sayi3;
		}
		
		System.out.println("En buyuk sayi: " + enBuyukSayi);
	}
}