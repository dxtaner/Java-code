package gelismisatm;

import java.util.Scanner;

public class Giris {
	
	
	public boolean giris(Hesap hesap){
	
	    Scanner sc = new Scanner(System.in);
	    
	    System.out.print("Kullanýcý Adý :");
	    String kullaniciAdi=sc.nextLine();
	    System.out.print("Þifre :");
	    String sifre=sc.nextLine();
	    
	    if(hesap.getKullaniciAdi().equals(kullaniciAdi) && hesap.getSifre().equals(sifre)){
	    	return true;
	    }
	    else {
	    	return false;
	    }
	}

}
