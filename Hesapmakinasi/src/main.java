import java.util.Scanner;

public class main {

	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.println(" 1 için toplama\n 2 için çýkarma\n"
        		+ " 3 için çarpma\n 4 için bölme\n 5 için kalan bulma");
        
        int islem;
        System.out.println("Ýþlemi Seçin :");
        islem=sc.nextInt();
        
        int a,b;
        
        switch(islem){
           
          case 1:
        	  System.out.println("birinci sayi :");
        	  a=sc.nextInt();
        	  System.out.println("ikinci sayi :");
              b=sc.nextInt();
              System.out.println("Toplam :"+(a+b));
              break;
          case 2:
        	  System.out.println("birinci sayi :");
        	  a=sc.nextInt();
        	  System.out.println("ikinci sayi :");
              b=sc.nextInt();
              System.out.println("Fark :"+(a-b));
              break;
          case 3:  
        	  System.out.println("birinci sayi :");
    	      a=sc.nextInt();
    	      System.out.println("ikinci sayi :");
    	      b=sc.nextInt();
    	      System.out.println("Çarpým :"+(a*b));
              break;        
          case 4:
        	  System.out.println("birinci sayi :");
        	  a=sc.nextInt();
        	  System.out.println("ikinci sayi :");
              b=sc.nextInt();
              System.out.println("Bölüm :"+((double)a/b));
              break;        
          case 5:
        	  System.out.println("birinci sayi :");
        	  a=sc.nextInt();
        	  System.out.println("ikinci sayi :");
              b=sc.nextInt();
              System.out.println("Kalan :"+((double)a%b));
              break;
        default :
        	System.out.println("Geçersiz Ýþlem...");
        break;
        
        
        }
        
        
	}

}
