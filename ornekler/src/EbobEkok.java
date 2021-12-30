import java.util.Scanner;

public class EbobEkok {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir sayi girin:");
        int sayi1 = scanner.nextInt();
        System.out.println("Bir sayi girin:");
        int sayi2 = scanner.nextInt();
        int i=1,toplam=1;

        if(sayi1<sayi2){
            int temp = sayi1;
            sayi1 = sayi2;
            sayi2 = temp;
        }

        while (i<sayi2){
            if(sayi1%i==0 && sayi2%i==0){
                toplam=i;
            }
            i++;
        }

        System.out.println("Ebob:"+toplam);
        System.out.println("Ekok:"+(sayi1*sayi2)/toplam);

    }
}
