import java.util.Scanner;

public class DaireHesaplari {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Yaricap giriiniz:");
        int r = scanner.nextInt();
        double pi = 3.14;

        double cevre = 2 * pi * r;
        double alan = pi*r*r;
        System.out.println("daire cevre:"+cevre);
        System.out.println("daire alan:"+alan);

    }
}
