import java.util.Scanner;
public class ArtikYil {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(" Yil giriiniz:");
        int yil = scanner.nextInt();
        boolean dortyuzKatimi = false;

        if(yil % 400 == 0)
            dortyuzKatimi = true;

        if(!dortyuzKatimi){
            if (yil % 100 != 0 && yil % 4==0)
                System.out.println("artık yildir");
            else
                System.out.println("artık yil degil");
        }
        else
            System.out.println("artık yil");


    }
}