package gelismisatm;

public class main {

	public static void main(String[] args) {
		
		Hesap hesap = new Hesap("Taner","1234",1550);
		
		
		
		atm atm = new atm();
		atm.calis(hesap);
		System.out.println("Çıkılıyor..");
		
	}

}
