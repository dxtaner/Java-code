import java.util.Scanner;

public class ManavProgrami {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double elmaFiyat=2.10,armutFiyat=3.22,muzFiyat=4.11,uzumFiyat=1.90,portakalFiyat=1.55;

        System.out.println("Portakal dan kac kilo alacaksiniz:");
        int portakal = scanner.nextInt();
        System.out.println("Elma dan kac kilo alacaksiniz:");
        int elma = scanner.nextInt();
        System.out.println("Muz dan kac kilo alacaksiniz:");
        int muz = scanner.nextInt();
        System.out.println("Armut dan kac kilo alacaksiniz:");
        int armut = scanner.nextInt();
        System.out.println("Uzum den kac kilo alacaksiniz:");
        int uzum = scanner.nextInt();

        double toplam = portakal*portakalFiyat+elma*elmaFiyat+muz*muzFiyat+armut*elmaFiyat+uzum*uzumFiyat;

        System.out.println("Toplam tutar:"+toplam);
    }
}
