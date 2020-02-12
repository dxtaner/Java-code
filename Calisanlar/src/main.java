import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Ýþlemler\n 1.Yazilim Ýþlemleri\n "
				+ "2.Yönetici Ýþlemleri\n Çýkýþ için q'ya basýn");

		while (true) {
			System.out.print("Ýþlem Seçin :");
			String islem = sc.nextLine();
			if (islem.equals("q")) {
				System.out.println("Çýkýlýyor...");
				break;
			} else if (islem.equals("1")) {
				Yazilimci yazilimci = new Yazilimci("Taner", "Özer", "6575",
						"C,Java,C++");
				System.out.println("Yazýlýmci Ýþlemler\n 1.Format At"
						+ "\n 2.Bilgileri Göster\n Çýkýþ için q'ya basin..\n");
				while (true) {
					System.out.print("Yazilimci için iþlem seçin :");
					String yazislem = sc.nextLine();
					if (yazislem.equals("q")) {
						System.out.println("Yazilimci iþleminden çýkýlýyor...");
						break;
					} else if (yazislem.equals("1")) {
						System.out.print("iþletim Sistemi :");
						String isletimSistemi = sc.nextLine();
						yazilimci.formatAt(isletimSistemi);
					} else if (yazislem.equals("2")) {
						yazilimci.bilgleriGoster();

					} else {
						System.out.println("...Geçersiz Yazýlýmcý Ýþlem..");
					}
				}
			} else if (islem.equals("2")) {
				Yonetici yonetici = new Yonetici("Ahmet", "Ay", "5465", 4);
				System.out
						.println("Yönetici Ýþlemleri\n 1.Zam Yap\n 2.Bilgileri Göster\n"
								+ "Çýkýþ için q'ya basýn ");
				while (true) {
					System.out.print("Yönetici Ýþlemi Seçin :");
					String yonislem = sc.nextLine();
					if (yonislem.equals("q")) {
						System.out.println("Yönetici Ýþlemlerinden Çýkýlýyor");
						break;
					} else if (yonislem.equals("1")) {
						System.out.println("Ne kadar zam yapacaksýnýz :");
						int zam = sc.nextInt();
						sc.nextLine();
						yonetici.zamYap(zam);
					} else if (yonislem.equals("2")) {
						yonetici.bilgleriGoster();
					} else {
						System.out.println("Geçersiz Yönetici Ýþlemi");
					}
				}

			} else {
				System.out.println("...Geçersiz Ýþlem...");
			}
		}
	}

}
