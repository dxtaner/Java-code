import java.util.Scanner;

public class RecursiveAsalSayi {

    static boolean isPrime(int a,int i){
        if(i==1)
            return true;
        if (a % i == 0)
            return false;
        return isPrime(a,i=i-1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("bir sayi girin:");
        int sayi=scanner.nextInt();
        boolean dgr = isPrime(sayi,sayi/2);
        System.out.println( dgr == true ? (sayi+" sayisi asal"):(sayi+" sayisi asal degil"));

    }
}
