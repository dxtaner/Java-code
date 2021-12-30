import java.util.Scanner;

public class FibonacciSerisi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir sayi girin:");
        int sayi = scanner.nextInt();

        int first = 0;
        int second = 1;
        int third = first+second;

        System.out.print(sayi+" elemanli fibonaci serisi:");
        for(int i=0; i<=sayi; i++ ){
            System.out.print(first+" ");
            first=second;
            second=third;
            third=first+second;

        }
    }
}
