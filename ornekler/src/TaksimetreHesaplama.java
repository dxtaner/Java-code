import java.util.Scanner;

public class TaksimetreHesaplama {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double km = 2.20;
        double min = 20.0;
        double toplam = 10.0;

        System.out.println("Kac km gideceksiniz:");
        double yolKm = scanner.nextDouble();

        toplam += yolKm*km;

        System.out.println(toplam>20 ? toplam +" Tl" : "20 Tl");
    }
}