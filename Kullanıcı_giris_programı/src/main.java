import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
       
	    String isim="Taner";  
	    String sifre="ta1675";
	 
	    int hak=5;
	    
	    while(true){
	    	
	    	System.out.println("Ýsim Girin :");
	    	String ad=sc.nextLine();
	    	System.out.println("Þifre Girin");
	    	String sifr=sc.nextLine();
	    	
	    	if(ad.equals(isim) && sifr.equals(sifre)){
	    		System.out.println("Giriþ yapýlýyor.");
                break;
             }
	    	else if(!ad.equals(isim) && sifr.equals(sifre)){
	    		hak--;
	    		System.out.println("Hatalý Ýsim ");
	    		System.out.println("Giriþ hakkýnýz :"+hak);
	    	}
	    	else if(ad.equals(isim) && !sifr.equals(sifre)){
	    		hak--;
	    		System.out.println("Hatalý Þifre");
	    		System.out.println("Giriþ hakkýnýz :"+hak);
	    	}
	    	else{
	    		hak--;
	    		System.out.println("Ýsim ve Þifre Hatalý");
	    	    System.out.println("Giriþ hakkýnýz :"+hak);
	    	}
	    	if(hak==0){
	    		System.out.println("Giriþ Hakkýnýz Bitti");
	    		break;
	    	}
	    }
	
	}

}
