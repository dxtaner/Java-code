import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
       
	    String isim="Taner";  
	    String sifre="ta1675";
	 
	    int hak=5;
	    
	    while(true){
	    	
	    	System.out.println("�sim Girin :");
	    	String ad=sc.nextLine();
	    	System.out.println("�ifre Girin");
	    	String sifr=sc.nextLine();
	    	
	    	if(ad.equals(isim) && sifr.equals(sifre)){
	    		System.out.println("Giri� yap�l�yor.");
                break;
             }
	    	else if(!ad.equals(isim) && sifr.equals(sifre)){
	    		hak--;
	    		System.out.println("Hatal� �sim ");
	    		System.out.println("Giri� hakk�n�z :"+hak);
	    	}
	    	else if(ad.equals(isim) && !sifr.equals(sifre)){
	    		hak--;
	    		System.out.println("Hatal� �ifre");
	    		System.out.println("Giri� hakk�n�z :"+hak);
	    	}
	    	else{
	    		hak--;
	    		System.out.println("�sim ve �ifre Hatal�");
	    	    System.out.println("Giri� hakk�n�z :"+hak);
	    	}
	    	if(hak==0){
	    		System.out.println("Giri� Hakk�n�z Bitti");
	    		break;
	    	}
	    }
	
	}

}
