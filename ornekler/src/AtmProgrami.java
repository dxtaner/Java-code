import java.util.Scanner;

public class AtmProgrami {
    public static void main(String[] args) {
        String userName, password;
        Scanner scanner = new Scanner(System.in);
        int right = 3;
        int balance = 1500;
        int select;
        while (right > 0) {
            System.out.print("Kullanıcı Adınız :");
            userName = scanner.nextLine();
            System.out.print("Parolanız : ");
            password = scanner.nextLine();

            if (userName.equals("taner") && password.equals("1234")) {
                System.out.println("Merhaba, Atm Programina Hoşgeldiniz!");
                do {
                    System.out.println("1-Para yatırma\n" +
                            "2-Para Çekme\n" +
                            "3-Bakiye Sorgula\n" +
                            "4-Çıkış Yap");
                    System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz : ");
                    select = scanner.nextInt();
                    switch (select){
                        case 1:
                            System.out.print("Para miktarı : ");
                            int price = scanner.nextInt();
                            balance += price;
                            break;
                        case 2:
                            System.out.print("Para miktarı : ");
                            price = scanner.nextInt();
                            if (price > balance) {
                                System.out.println("Bakiye yetersiz.");
                            } else {
                                balance -= price;
                            }
                            break;
                        case 3:
                            System.out.println("Bakiyeniz : " + balance);
                            break;
                        default:
                            System.out.println("Gecersiz islem");
                            break;
                    }
                } while (select != 4);
                System.out.println("Tekrar bekleriz...");
                break;
            } else {
                right--;
                System.out.println("Hatali kullanici adı veya şifre. Tekrar deneyiniz.");
                if (right == 0) {
                    System.out.println("Hesabiniz bloke olmustur lütfen banka ile iletişime geciniz.");
                } else {
                    System.out.println("Kalan hakkiniz : " + right);
                }
            }
        }
    }
}

