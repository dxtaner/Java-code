
public class asalSayi {

	public static void main(String[] args) {

		boolean isPrime = true;
		int number = 19;

		if (number < 2) {
			System.out.println("Geçersiz sayı girildi.");
			return;
		} else if (number != 2 && number % 2 == 0) {
			isPrime = false;
		} else {
			for (int i = 2; i < ((int) (number / 2)); i++) {
				if (number % i == 0) {
					isPrime = false;
					break;
				}
			}
		}

		if (isPrime) {
			System.out.println(number + " sayısı asaldır.");
		} else {
			System.out.println(number + " sayısı asal değildir.");
		}
	}
}
