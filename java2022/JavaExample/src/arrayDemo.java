public class arrayDemo {

	public static void main(String[] args) {
		String[] ogrenciler = new String[4];
		ogrenciler[0] = "Ali";
		ogrenciler[1] = "Semih";
		ogrenciler[2] = "Taner";
		ogrenciler[3] = "Ahmet";

		for (int i = 0; i < ogrenciler.length; i++) {
			System.out.println("Ogrenci" + "[" + (i + 1) + "]" + " " + ogrenciler[i]);
		}

		System.out.println("\n*****************\n");

		for (String ogrenci : ogrenciler) {
			System.out.println("Ogrenci " + ogrenci);

		}
		
		System.out.println("\n*****************\n");

       

	}
}