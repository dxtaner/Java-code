import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("��lemler\n 1.Yazilim ��lemleri\n "
				+ "2.Y�netici ��lemleri\n ��k�� i�in q'ya bas�n");

		while (true) {
			System.out.print("��lem Se�in :");
			String islem = sc.nextLine();
			if (islem.equals("q")) {
				System.out.println("��k�l�yor...");
				break;
			} else if (islem.equals("1")) {
				Yazilimci yazilimci = new Yazilimci("Taner", "�zer", "6575",
						"C,Java,C++");
				System.out.println("Yaz�l�mci ��lemler\n 1.Format At"
						+ "\n 2.Bilgileri G�ster\n ��k�� i�in q'ya basin..\n");
				while (true) {
					System.out.print("Yazilimci i�in i�lem se�in :");
					String yazislem = sc.nextLine();
					if (yazislem.equals("q")) {
						System.out.println("Yazilimci i�leminden ��k�l�yor...");
						break;
					} else if (yazislem.equals("1")) {
						System.out.print("i�letim Sistemi :");
						String isletimSistemi = sc.nextLine();
						yazilimci.formatAt(isletimSistemi);
					} else if (yazislem.equals("2")) {
						yazilimci.bilgleriGoster();

					} else {
						System.out.println("...Ge�ersiz Yaz�l�mc� ��lem..");
					}
				}
			} else if (islem.equals("2")) {
				Yonetici yonetici = new Yonetici("Ahmet", "Ay", "5465", 4);
				System.out
						.println("Y�netici ��lemleri\n 1.Zam Yap\n 2.Bilgileri G�ster\n"
								+ "��k�� i�in q'ya bas�n ");
				while (true) {
					System.out.print("Y�netici ��lemi Se�in :");
					String yonislem = sc.nextLine();
					if (yonislem.equals("q")) {
						System.out.println("Y�netici ��lemlerinden ��k�l�yor");
						break;
					} else if (yonislem.equals("1")) {
						System.out.println("Ne kadar zam yapacaks�n�z :");
						int zam = sc.nextInt();
						sc.nextLine();
						yonetici.zamYap(zam);
					} else if (yonislem.equals("2")) {
						yonetici.bilgleriGoster();
					} else {
						System.out.println("Ge�ersiz Y�netici ��lemi");
					}
				}

			} else {
				System.out.println("...Ge�ersiz ��lem...");
			}
		}
	}

}
