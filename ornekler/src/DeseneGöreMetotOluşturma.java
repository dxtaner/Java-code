import java.util.Scanner;

public class DeseneGöreMetotOluşturma {

    static void desenBastir(int a){

        if(a>=1) {
            System.out.print(a + " ");
            desenBastir(a-5);
        }
        System.out.print(a + " ");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("bir sayi girin:");
        int sayi = scanner.nextInt();
        desenBastir(sayi);

    }
}
