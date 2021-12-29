import java.util.Scanner;

public class EnBuyukEnKucukSayiBulma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("kac adet sayi gireceksiniz: ");
        int adet = scanner.nextInt();

        int enbuyuk=0, enkucuk=0;
        for(int i=0; i<adet; i++){
            System.out.println((i+1)+". sayiyi giriniz:");
            int sayi = scanner.nextInt();

            if(sayi>enbuyuk)
                enbuyuk=sayi;
            if(sayi<enkucuk)
                enkucuk=sayi;
        }

        System.out.println("En buyuk sayi: "+enbuyuk+"\nEn kucuk sayi: "+enkucuk);



    }
}
