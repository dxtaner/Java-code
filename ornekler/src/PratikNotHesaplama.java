import java.util.Scanner;
public class PratikNotHesaplama {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double toplam = 0.0;
        int count=0;

        System.out.println("Matematik Notu giriiniz:");
        int mat = scanner.nextInt();
        if(mat>=0 && mat<=100){
            toplam += mat;
            count++;
        }
        System.out.println("Tarih notu giriiniz:");
        int tarih = scanner.nextInt();
        if(tarih>=0 && tarih<=100){
            toplam += tarih;
            count++;
        }
        System.out.println("Fizik notu giriiniz:");
        int fizik = scanner.nextInt();
        if(fizik>=0 && fizik<=100){
            toplam += fizik;
            count++;
        }
        System.out.println("Kimya notu giriiniz:");
        int kimya = scanner.nextInt();
        if(kimya>=0 && kimya<=100){
            toplam += kimya;
            count++;
        }
        System.out.println("Türkce notu giriiniz:");
        int turkce = scanner.nextInt();
        if(turkce>=0 && turkce<=100){
            toplam += turkce;
            count++;
        }

        double ortalama = toplam/count;

        System.out.println("Toplam Not: "+toplam+" Ortalama: "+ortalama);
        System.out.println( ortalama >55 ? "Sınıfı gecti" : "Sınıfta Kaldı");


    }
}