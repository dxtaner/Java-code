import java.util.Scanner;

public class BurcBulma {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ay girin (1-12) :");
        int ay = scanner.nextInt();
        System.out.println("Gun  girin (1-31) :");
        int gun = scanner.nextInt();
        String burc=" ";

        if (ay==1) {
            if (gun < 22)
                burc = "Oglak";
            else
                burc = "Kova";
        }
        if(ay==2) {
            if (gun < 22)
                burc = "Kova";
            else
                burc = "Balik";
        }
        if(ay==3) {
            if (gun < 22)
                burc = "Balik";
            else
                burc = "Koç";
        }
        if(ay==4) {
            if (gun < 22)
                burc = "Koç";
            else
                burc = "Boga";
        }
        if(ay==5) {
            if (gun < 22)
                burc = "Boga";
            else
                burc = "İkizler ";
        }
        if(ay==6) {
            if (gun < 22)
                burc = "İkizler ";
            else
                burc = "Yengec";
        }
        if(ay==7) {
            if (gun < 22)
                burc = "Yengec";
            else
                burc = "Aslan";
        }
        if(ay==8) {
            if (gun < 22)
                burc = "Aslan";
            else
                burc = "Başak";
        }
        if(ay==9) {
            if (gun < 22)
                burc = "Başak";
            else
                burc = "Terazi ";
        }
        if(ay==10) {
            if (gun < 22)
                burc = "Terazi ";
            else
                burc = "Akrep";
        }
        if(ay==11) {
            if (gun < 22)
                burc = "Akrep ";
            else
                burc = "Yay";
        }
        if(ay==12) {
            if (gun < 22)
                burc = "Yay";
            else
                burc = "Oğlak";
        }
        System.out.println("Burc bilginiz:"+burc);
    }
}

