package gelismisatm;

import java.util.Scanner;

public class Giris {
	
	
	public boolean giris(Hesap hesap){
	
	    Scanner sc = new Scanner(System.in);
	    
	    System.out.print("Kullan�c� Ad� :");
	    String kullaniciAdi=sc.nextLine();
	    System.out.print("�ifre :");
	    String sifre=sc.nextLine();
	    
	    if(hesap.getKullaniciAdi().equals(kullaniciAdi) && hesap.getSifre().equals(sifre)){
	    	return true;
	    }
	    else {
	    	return false;
	    }
	}

}
