import java.util.Scanner;

public class main {

	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.println(" 1 i�in toplama\n 2 i�in ��karma\n"
        		+ " 3 i�in �arpma\n 4 i�in b�lme\n 5 i�in kalan bulma");
        
        int islem;
        System.out.println("��lemi Se�in :");
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
    	      System.out.println("�arp�m :"+(a*b));
              break;        
          case 4:
        	  System.out.println("birinci sayi :");
        	  a=sc.nextInt();
        	  System.out.println("ikinci sayi :");
              b=sc.nextInt();
              System.out.println("B�l�m :"+((double)a/b));
              break;        
          case 5:
        	  System.out.println("birinci sayi :");
        	  a=sc.nextInt();
        	  System.out.println("ikinci sayi :");
              b=sc.nextInt();
              System.out.println("Kalan :"+((double)a%b));
              break;
        default :
        	System.out.println("Ge�ersiz ��lem...");
        break;
        
        
        }
        
        
	}

}
