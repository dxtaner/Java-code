import java.util.Scanner;

public class UsluSayiHesaplama {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir sayi girin:");
        int sayi1 = scanner.nextInt();
        System.out.println("Bir sayi girin:");
        int sayi2 = scanner.nextInt();
        int toplam = 1;
        for(int i=0; i<sayi2; i++){
            toplam*=sayi1;
        }

        System.out.println("Usleri: "+toplam);
    }
}
