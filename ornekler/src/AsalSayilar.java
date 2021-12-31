import java.util.Scanner;

public class AsalSayilar {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // int deger = scanner.nextInt();
        System.out.print("Asal sayilar (1-100):");

        for(int i = 2; i < 101; i++){
            boolean isPrime = true;
            for(int j = 2; j<=i/2; j++){
                if(i % j == 0){
                    isPrime=false;
                    break;
                }
            }
            if(isPrime)
                System.out.print(i+" ");
        }

    }
}
