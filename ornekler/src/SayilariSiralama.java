import java.util.Scanner;

public class SayilariSiralama {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir sayi girin:");
        int sayi1 = scanner.nextInt();
        System.out.println("Bir sayi girin:");
        int sayi2 = scanner.nextInt();
        System.out.println("Bir sayi girin:");
        int sayi3 = scanner.nextInt();

        if(sayi1>sayi3 && sayi1>sayi2){
            if(sayi2>sayi3)
                System.out.println(sayi1+">"+sayi2+">"+sayi3);
            else
                System.out.println(sayi1+">"+sayi3+">"+sayi2);
        }
        else if(sayi2>sayi3 && sayi2>sayi1){
            if(sayi1>sayi3)
                System.out.println(sayi2+">"+sayi1+">"+sayi3);
            else
                System.out.println(sayi2+">"+sayi3+">"+sayi1);
        }
        else if(sayi3>sayi2 && sayi3>sayi1){
            if(sayi2>sayi1)
                System.out.println(sayi3+">"+sayi2+">"+sayi1);
            else
                System.out.println(sayi3+">"+sayi1+">"+sayi2);

        }
    }
}
