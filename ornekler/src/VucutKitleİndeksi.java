import java.util.Scanner;

public class VucutKitleİndeksi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Boyunuzu giriiniz:");
        double boy = scanner.nextDouble();

        System.out.println("Kilonuzu giriiniz:");
        int kilo = scanner.nextInt();

        System.out.println("Vucut Kitle indeksiniz:"+kilo/(boy*boy));
    }
}