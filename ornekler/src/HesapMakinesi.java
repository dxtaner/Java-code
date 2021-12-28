import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Sayi degeri girin:");
        int deger1 = scanner.nextInt();
        System.out.println("Sayi degeri girin:");
        int deger2 = scanner.nextInt();

        System.out.println("1 toplama\n2 cikarma\n3 carpma\n4 bolme\n5 mod alma");
        System.out.println("Bir islem seciniz");
        int islemTipi=scanner.nextInt();


        switch (islemTipi){
            case 1:
                System.out.println("Toplama degeri:"+deger1+deger2);
                break;
            case 2:
                System.out.println("Cikarma degeri:"+deger1+deger2);
                break;
            case 3:
                System.out.println("Carpma degeri:"+deger1*deger2);
                break;
            case 4:
                if(deger2==0)
                    System.out.println("deger1 0'a bolunmez");
                else
                    System.out.println("Bolme degeri:" + deger1/deger2);
                break;
            case 5:
                //if(deger1>deger2)
                //  System.out.println(deger1+deger2);
                System.out.println("Mod alma  degeri:"+deger1%deger2);
                break;
            default:
                System.out.println("Yanlis islem sectiniz:");
                break;
        }
    }
}