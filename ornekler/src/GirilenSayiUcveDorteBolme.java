import java.util.Scanner;

public class GirilenSayiUcveDorteBolme {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("adet giriniz: ");
        int adet = scanner.nextInt();
        int toplam = 0;
        int say=0;
        int bolunenler=0;
        double ortalama=0.0;

        while (say < adet){
            System.out.println("sayi giriniz: ");
            int sayi = scanner.nextInt();
            if(sayi%3==0 || sayi %4==0){
                toplam +=sayi;
                bolunenler+=1;
            }
            say++;
        }
        System.out.println("Toplam sayi: "+toplam);
        System.out.println("Ortalama:" +toplam/bolunenler);
    }
}

