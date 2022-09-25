
public class SesliHarfler {

	public static void main(String[] args) {

		char letter = 'a';

		switch (letter) {
			case 'e':
			case 'E':
			case 'İ':
			case 'i':
			case 'ö':
			case 'Ö':
			case 'Ü':
			case 'ü':
				System.out.println("İnce sesli harf.");
				break;
			default:
				System.out.println("Kalın sesli harf.");
		}

	}
}
