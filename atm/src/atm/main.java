package atm;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    
    int bakiye=2500;
    
    System.out.println(" 1.i�lem : bakiye ��renme\n 2.i�lem para �ekme\n 3.i�lem para yat�rma\n"
			+ "��k�� i�in q'ya bas�n.. ");
    
    while(true){
    	
    	System.out.print("��lem Se�in :");
        String islem=sc.nextLine();
    	
    	if(islem.equals("1")){
    		System.out.println("Mevcut bakiyeniz :"+bakiye);	
    	}
    	else if(islem.equals("2")){
    		System.out.println("Ne kadar para �eke�eksiniz :");
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
    		System.out.println("Ne kadar para yat�racaks�n�z :");
    		int yatiralanmiktar = sc.nextInt();
    		sc.nextLine();
    		bakiye+=yatiralanmiktar;
    		System.out.println("Mevcut bakiyeniz :"+bakiye);
    	}
    	else if(islem.equals("-1") || islem.equals("q")){
    		System.out.println(".....Programdan ��k�l�yor...");
    	break;
    	}
    	else {
    		System.out.println("Ge�ersiz ��lem...");
    	}
    }

	}

}
