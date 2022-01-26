import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        int number = rand.nextInt(100);
        //int number = (int) (Math.random() * 100);

        int num;
        int right=0;
        int[] wrong = new int[5];
        boolean isWrong = false;
        boolean isWin = false;

        while (right < 5 ){
            System.out.print("Lütfen tahmininizi giriniz : ");
            num = scanner.nextInt();

            if (num < 0 || num > 99) {
                System.out.println("Lütfen 0-100 arasında bir değer giriniz.");
                if (isWrong) {
                    right+=1;
                    System.out.println("Çok fazla hatalı giriş yaptınız. Kalan hak : " +(5- right) );
                } else {
                    isWrong = true;
                    System.out.println("Bir daha hatalı girişinizde hakkınızdan düşülecektir.");
                }
                continue;

            }

            if (num == number) {
                System.out.println("Tebrikler, doğru tahmin ! Tahmin ettiğini sayı : " + number);
                isWin = true;
                break;
            } else {
                System.out.println("Hatalı bir sayı girdiniz !");
                if (num > number) {
                    System.out.println(num + " sayısı, sakli sayidan büyüktür.");
                } else {
                    System.out.println(num + " sayısı, sakli sayidan küçüktür.");
                }

                wrong[right++] = num;
                System.out.println("Kalan hakkı : " + (5-right));
            }
        }

        if (!isWin) {
            System.out.println("Kaybettiniz ! Sakli Sayi : "+number);
            if (!isWrong) {
                System.out.println("Tahminleriniz : " + Arrays.toString(wrong));
            }
        }

    }
}
