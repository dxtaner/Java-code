import java.util.Scanner;

public class RecursiveUsluSayi {
    static int UsluSayi(int a,int b){
        if(b<1)
            return 1;
        return a * UsluSayi(a,b-1);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayi girin:");
        int sayi1=scanner.nextInt();
        System.out.print("Bir sayi girin:");
        int sayi2=scanner.nextInt();
        System.out.print(UsluSayi(sayi1,sayi2));
    }

}
