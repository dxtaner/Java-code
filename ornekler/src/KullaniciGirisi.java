import java.util.Scanner;

public class KullaniciGirisi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Kullanici adi girin:");
        String kAdi= scanner.nextLine();

        System.out.print("Sifre girin:");
        String sifre = scanner.nextLine();

        String kName="taner", parola="1234";

        if(kAdi.equals(kName) && sifre.equals(parola)){
            System.out.println("Giris basarili");
        }
        else{
            System.out.println("Hatalı sifre girdiniz sifre sıfırlamak istermisiniz (y/n)");
            String secenek = scanner.nextLine();

            if(secenek.equals("y")){
                System.out.println("Sifre giriniz:");
                String yenisifre=scanner.nextLine();
                if(yenisifre.equals(parola)){
                    System.out.println("Sifreler aynı");
                }
                else {
                    System.out.println("Sifre guncellendi");
                }
            }
            else if(secenek.equals("n")){
                System.out.println("Cıkıs yapılıyor...");
            }
        }

    }
}
