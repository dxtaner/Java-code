import java.util.Scanner;

public class DortunKatlariToplami {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int toplam = 0;
        int say=0;
        int sayi=2;
        while (sayi%2==0){
            System.out.println("sayi giriniz: ");
            sayi = scanner.nextInt();
            if(sayi %4 ==0){
                toplam +=sayi;
            }

        }
        System.out.println("Toplam sayi: "+toplam);
    }
}
