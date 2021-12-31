import java.util.Scanner;

public class SayininBasamaklariToplami {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir sayi girin:");
        int sayi = scanner.nextInt();
        int sonBasamak,toplam=0;

        while (sayi>0){
            sonBasamak = sayi % 10;
            toplam+=sonBasamak;
            sayi = sayi/10;
        }

        System.out.println("basamak toplamlari: "+toplam);
    }
}
