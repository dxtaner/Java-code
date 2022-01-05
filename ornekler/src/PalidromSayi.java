import java.util.Scanner;

public class PalidromSayi {

    static boolean isPalidrome(int sayi){
        int temp=sayi, newSayi = 0, sonBasamak;
        while (temp != 0){
            sonBasamak = temp % 10;
            newSayi = (newSayi * 10) + sonBasamak;
            temp /= 10;
        }
        return sayi==newSayi;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(" sayi giriniz:");
        int sayi = scanner.nextInt();

        System.out.print(isPalidrome(sayi));
    }
}
