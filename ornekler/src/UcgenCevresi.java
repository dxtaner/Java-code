import java.util.Scanner;

public class UcgenCevresi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("A Kenari giriiniz:");
        int a = scanner.nextInt();
        System.out.println("B kenari giriiniz:");
        int b = scanner.nextInt();
        System.out.println("C kenari giriiniz:");
        int c = scanner.nextInt();

        double u = (a+b+c)/2;
        double cevre = 2.0 * u;
        double alanxalan = u*(u-a)*(u-b)*(u-c);
        double alan = alanxalan/2;

        System.out.println("ücgen cevre:"+cevre);
        System.out.println("ucgen alan:"+alan);

    }
}
