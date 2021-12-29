import java.util.Scanner;

public class DortVeBesKuvvetleri {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir sayi girin:");
        int sayi = scanner.nextInt();

        for (int i=1; i<sayi; i*=4){
            System.out.println("sayi: "+i);
        }

        for (int j=1; j<sayi; j*=5){
            System.out.println("sayi: "+j);
        }


    }
}
