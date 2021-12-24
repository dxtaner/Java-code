import java.util.Scanner;
public class NotHesaplama {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Matematik Notu giriiniz:");
        int mat = scanner.nextInt();
        System.out.println("Tarih notu giriiniz:");
        int tarih = scanner.nextInt();
        System.out.println("Fizik notu giriiniz:");
        int fizik = scanner.nextInt();
        System.out.println("Kimya notu giriiniz:");
        int kimya = scanner.nextInt();
        System.out.println("Türkce notu giriiniz:");
        int turkce = scanner.nextInt();

        int toplam = mat+tarih+fizik+kimya+turkce;
        double ortalama = toplam/5;

        System.out.println( ortalama >60 ? "Sınıfı gecti" : "Sınıfta Kaldı");


    }
}