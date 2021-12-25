import java.util.Scanner;
public class KdvHesaplama {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double kdvOrani = 0.18;
        System.out.println("Fiyat giriniz:");
        int fiyat = scanner.nextInt();
        double toplamFiyat = 0.0;

        if(fiyat>1000)
            kdvOrani = 0.08;

        toplamFiyat = (double)fiyat + (double)fiyat * kdvOrani;
        System.out.println("Kdv'siz Fiyat:"+fiyat);
        System.out.println("Kdv'li Fiyat:"+toplamFiyat);
        System.out.println("Kdv Tutari:"+kdvOrani);


    }
}