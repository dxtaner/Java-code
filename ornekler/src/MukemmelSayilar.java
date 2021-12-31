import java.util.Scanner;

public class MukemmelSayilar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir sayi girin:");
        int sayi = scanner.nextInt();
        int toplam = 0;
        boolean mukemmelSayimi = false;

        for (int i = 1; i<sayi; i++){

            if(sayi%i==0){
                toplam+=i;
            }

            if(sayi==toplam){
                mukemmelSayimi = true;
            }
        }

        if(mukemmelSayimi)
            System.out.println("Mukemmel sayidir");
        else
            System.out.println("Mukemmel sayi degildir");
    }
}
