package gelismisatm;

import java.util.Scanner;

public class atm {
	public void calis(Hesap hesap) {
		Giris giris = new Giris();

		Scanner sc = new Scanner(System.in);
		System.out.println("........Kullan�c� Giri� Ekran�....");

		int hak = 3;
		while (true) {
			if (giris.giris(hesap)) {
				System.out.println("Giri� Ba�aral�");
				break;
			} else {
				hak--;
				System.out.println("Giri� Ba�ar�s�z " + "\nGiri� Hakk�:" + hak);
			}

			if (hak == 0) {
				System.out.println("Giri� hakk�n�z bitti..");
				return;
			}
		}
		System.out.println("1.i�lem bakiye \n2.i�lem para yat�rma\n3.i�lem para"
						+ " �ekme\n��k�� i�in q'ya bas�n..");
		
		while(true){
			
			System.out.print("��lem Se�in:");
			String islem=sc.nextLine();
			if(islem.equals("q")){
				
				System.out.println("��k�l�yorr....");
				break;
			}
			else if(islem.equals("1")){
				System.out.println("Bakiyeniz :"+hesap.getBakiye());
			}
			else if(islem.equals("2")){
				System.out.print("Ne kadar para yat�racaks�n�z :");
				int miktar =sc.nextInt();
				sc.nextLine();
				hesap.paraYatir(miktar);
				
			}
			else if(islem.equals("3")){
				System.out.print("Ne kadar para �eke�eksininiz :");
			    int miktar =sc.nextInt();
			    sc.nextLine();
			    hesap.paraCek(miktar);
			}
			else {
			    	System.out.println("Ge�ersiz i�lem");}
			    }
	}
}
