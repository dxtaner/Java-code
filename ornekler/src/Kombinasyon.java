import java.util.Scanner;

public class Kombinasyon {
    public static void main(String[] args) {
        // C(n,r) = n! / (r! * (n-r)!)
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir sayi girin:");
        int sayi1 = scanner.nextInt();
        System.out.println("Bir sayi girin:");
        int sayi2 = scanner.nextInt();
        double kombinasyon=0.0;

        if(sayi1<sayi2){
            int temp = sayi1;
            sayi1=sayi2;
            sayi2=temp;
        }

        int n=1,r=1, nEksir=1;
        for(int i=1; i<=sayi1; i++){
            n*=i;
        }
        for(int j=1; j<=sayi2; j++){
            r*=j;
        }
        for(int z=1; z<=sayi1-sayi2; z++){
            nEksir*=z;
        }

        kombinasyon = n/(r * nEksir);



        System.out.println(sayi1+" in " + sayi2+" li kombinasyonu: "+kombinasyon);

    }
}
