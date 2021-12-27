import java.util.Scanner;

public class CinZodyagi {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Dogum tarihi giriniz: ");
        int date = scanner.nextInt();

        if(date%12==0)
            System.out.println("Maymun burcu");
        if(date%12==1)
            System.out.println("Horoz burcu");
        if(date%12==2)
            System.out.println("Köpek burcu");
        if(date%12==3)
            System.out.println("Domuz burcu");
        if(date%12==4)
            System.out.println("Fare burcu");
        if(date%12==5)
            System.out.println("Öküz burcu");
        if(date%12==6)
            System.out.println("Kaplan burcu");
        if(date%12==7)
            System.out.println("Tavsan burcu");
        if(date%12==8)
            System.out.println("Ejderha burcu");
        if(date%12==9)
            System.out.println("Yilan burcu");
        if(date%12==10)
            System.out.println("At burcu");
        if(date%12==11)
            System.out.println("Koyun burcu");

    }
}

