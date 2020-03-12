package gelismisatm;

import java.util.Scanner;

public class atm {
	public void calis(Hesap hesap) {
		Giris giris = new Giris();

		Scanner sc = new Scanner(System.in);
		System.out.println("........Kullanýcý Giriþ Ekraný....");

		int hak = 3;
		while (true) {
			if (giris.giris(hesap)) {
				System.out.println("Giriþ Baþaralý");
				break;
			} else {
				hak--;
				System.out.println("Giriþ Baþarýsýz " + "\nGiriþ Hakký:" + hak);
			}

			if (hak == 0) {
				System.out.println("Giriþ hakkýnýz bitti..");
				return;
			}
		}
		System.out.println("1.iþlem bakiye \n2.iþlem para yatýrma\n3.iþlem para"
						+ " çekme\nÇýkýþ için q'ya basýn..");
		
		while(true){
			
			System.out.print("Ýþlem Seçin:");
			String islem=sc.nextLine();
			if(islem.equals("q")){
				
				System.out.println("çýkýlýyorr....");
				break;
			}
			else if(islem.equals("1")){
				System.out.println("Bakiyeniz :"+hesap.getBakiye());
			}
			else if(islem.equals("2")){
				System.out.print("Ne kadar para yatýracaksýnýz :");
				int miktar =sc.nextInt();
				sc.nextLine();
				hesap.paraYatir(miktar);
				
			}
			else if(islem.equals("3")){
				System.out.print("Ne kadar para çekeçeksininiz :");
			    int miktar =sc.nextInt();
			    sc.nextLine();
			    hesap.paraCek(miktar);
			}
			else {
			    	System.out.println("Geçersiz iþlem");}
			    }
	}
}
