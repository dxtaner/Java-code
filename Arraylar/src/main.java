import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class main {

	public static void arrayBastir(int[] array) {

		for (int i = 0; i < array.length; i++) {
			System.out.println("Eleman " + i + " :" + array[i]);
		}

	}

	public static double ortalama(int[] array) {
		int toplam = 0;
		for (int i = 0; i < array.length; i++) {
			toplam += array[i];
		}
		return (double) toplam / array.length;
	}

	public static int max(int[] array) {
		int max = array[0];
		for (int i = 0; i < array.length; i++) {

			if (array[i] > max) {
				max = array[i];
			}
		}
		return max;
	}

	public static int min(int[] array) {
		int min = array[0];
		for (int i = 0; i < array.length; i++) {

			if (array[i] < min) {
				min = array[i];
			}
		}
		return min;
	}

	public static int[] arrayiDoldur(int sayi) {
		Scanner sc = new Scanner(System.in);
		int[] a = new int[sayi];
		for (int i = 0; i < sayi; i++) {
			System.out.print("Dizinin elamanı :");
			a[i] = sc.nextInt();
		}
		return a;
	}

	public static void arraySiralama(int[] array) {
		Arrays.sort(array); // Arrays.sort diziyi sıralar
		arrayBastir(array);

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		/*
		 * int[] a = new int[10]; a[5]=32; a[4]=16;
		 */
		int[] a = { 1, 3, 5, 7, 9 };
		// System.out.println(a[0]);
		// System.out.println(a[4]);
		// System.out.println(a[60]); // array indexi aşma hatasi

		int[] b = new int[5];

		int[] c = { 15, 40, 8, 66, 57 };

		/*
		 * for (int i = 0; i < 5; i++) { // a[i]=i*5-1; //
		 * System.out.println(a[i]); System.out.print("Eleman Girin :"); b[i] =
		 * sc.nextInt(); System.out.println("Dizinin elemani :" + b[i]);
		 * 
		 * } System.out.println("C dizisinin uzunluğu :" + c.length);
		 */
		/*
		 * arrayBastir(c); System.out.println("Ortalama : " + ortalama(c));
		 * System.out.println("C dizisinin en büyük elemanı :" + max(c));
		 * System.out.println("C dizisinin en küçük elemanı :" + min(c));
		 */
		System.out.println("Bir sayi girin :");
		int sayi = sc.nextInt();
		int[] d = arrayiDoldur(sayi);
		arrayBastir(d);
		System.out.println("Ortalama : " + ortalama(d));
		System.out.println("C dizisinin en büyük elemanı :" + max(d));
		System.out.println("C dizisinin en küçük elemanı :" + min(d));
		arraySiralama(d);

	}
}
