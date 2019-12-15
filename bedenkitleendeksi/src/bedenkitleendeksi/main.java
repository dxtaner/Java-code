package bedenkitleendeksi;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Kilonuzu Girin :");
		int kilo = sc.nextInt();
		System.out.println("Boyunuzu Girin : (Örneðin 1,84)");
        double boy = sc.nextDouble();
        
        double bke = kilo/(boy*boy);
        System.out.println("Beden Kitle Endeksiniz :"+ bke);
	}

}
