
public class MükSayi {

	public static void main(String[] args) {

		int number = 125, total = 1;

		if (number < 6) {
			System.out.println("Geçersiz sayı girildi. En küçük mükemmel sayı 6'dır.");
			return;
		} else {
			for (int i = 2; i <= ((int) (number / 2)); i++) {
				if (number % i == 0) {
					total += i;
				}
			}
		}

		if (total == number) {
			System.out.println(number + " mükemmel sayıdır.");
		} else {
			System.out.println(number + " mükemmel sayı değildir.");
		}

	}
}
