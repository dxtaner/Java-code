import java.util.Scanner;

public class HavaSicakligi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Sıcalık degeri girin:");
        int deger = scanner.nextInt();

        if(deger<=5)
            System.out.println("Kayak yapabilirsin. Sıcaklık değeri:"+deger);
        if(deger>5 && deger<=15)
            System.out.println("Sinemaya gidebilirsin. Sıcaklık değeri:"+deger);
        if(deger>15 && deger<=25)
            System.out.println("Piknik yapmaya gidebilirsin. Sıcaklık değeri:"+deger);
        if(deger>25)
            System.out.println("Plaja gidebilirsin. Sıcaklık değeri:"+deger);
    }
}
