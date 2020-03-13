package atm;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    
    int bakiye=2500;
    
    System.out.println(" 1.iþlem : bakiye öðrenme\n 2.iþlem para çekme\n 3.iþlem para yatýrma\n"
			+ "Çýkýþ için q'ya basýn.. ");
    
    while(true){
    	
    	System.out.print("Ýþlem Seçin :");
        String islem=sc.nextLine();
    	
    	if(islem.equals("1")){
    		System.out.println("Mevcut bakiyeniz :"+bakiye);	
    	}
    	else if(islem.equals("2")){
    		System.out.println("Ne kadar para çekeçeksiniz :");
    		int cekilecekmiktar = sc.nextInt();
    		sc.nextLine();
    		if(cekilecekmiktar>bakiye){
    			System.out.println("Bakiyeniz eksik...");
    			System.out.println("Mevcut bakiyeniz :"+bakiye);
    		}
    		else {
    			bakiye-=cekilecekmiktar;
    			System.out.println("Mevcut bakiyeniz :"+bakiye);
    		}
    	}
    	else if(islem.equals("3")){
    		System.out.println("Ne kadar para yatýracaksýnýz :");
    		int yatiralanmiktar = sc.nextInt();
    		sc.nextLine();
    		bakiye+=yatiralanmiktar;
    		System.out.println("Mevcut bakiyeniz :"+bakiye);
    	}
    	else if(islem.equals("-1") || islem.equals("q")){
    		System.out.println(".....Programdan Çýkýlýyor...");
    	break;
    	}
    	else {
    		System.out.println("Geçersiz Ýþlem...");
    	}
    }

	}

}
