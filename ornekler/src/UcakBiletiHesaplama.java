import java.util.Scanner;

public class UcakBiletiHesaplama {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double total = 0.0;
        double kmTutar = 0.10;
        System.out.println("Mesafe giriniz:");
        int mesafe = scanner.nextInt();
        System.out.println("Yas giriniz:");
        int yas = scanner.nextInt();
        System.out.println("Yolculuk tipi giriniz:(1-> Gidis / 2-> Gidis-Gelis");
        String tip = scanner.next();

        if(!(mesafe>0 && yas>0 && (tip.equals("1") || tip.equals("2")))){
            System.out.println("Hatali veri girdiniz");
        }
        else{
            total = mesafe * kmTutar;
            if(yas<12){
                total -=total*0.50;
            }
            if(yas>=12 && yas<=24){
                total -=total*0.10;
            }
            if(yas>65){
                total -=total*0.30;
            }
            if(tip.equals("2")){
                total -=total*0.20;
            }
        }
        System.out.println("Toplam tutar: "+total+" Tl");

    }
}
