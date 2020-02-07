import java.util.ArrayList;

public class main {

	public static void yazdir(ArrayList<String> a) {

		/*
		 * for (int i = 0; i < a.size(); i++) {
		 * System.out.println("Eleman :"+(i+1)+" :"+a.get(i)); }
		 */
		for (String s : a) { // for each dongusü
			System.out.println("Eleman : " + s);
		}
	}

	public static void main(String[] args) {

		ArrayList<String> arraylist = new ArrayList<String>();

		arraylist.add("Taner"); // add arrayliste ekler
		arraylist.add("Enes");
		arraylist.add("Ali");
		arraylist.add("Ahmet");

		// System.out.println(arraylist.get(0)); // get o indexdeki degeri
		// dondurur
		// System.out.println(arraylist.get(2));

		System.out.println(arraylist.size()); // size arraylist boyu

		for (int i = 0; i < arraylist.size(); i++) {
			System.out.println(arraylist.get(i));
		}
		/*
		 * arraylist.remove("Ali"); arraylist.remove(2); for (int i = 0; i <
		 * arraylist.size(); i++) { System.out.println(arraylist.get(i)); }
		 */
		System.out.println(arraylist.indexOf("Enes")); // indexof enes in
														// gordugu ilk indexi
														// yerir..
		// System.out.println(arraylist.lastIndexOf("Enes")); lastindexof son
		// enes in gordugu index
		System.out.println(arraylist.indexOf("Loal")); // yoksa -1 döner

		arraylist.set(0, "Mehmet"); // set guncelleme methodu
		System.out.println(arraylist.get(0));

		yazdir(arraylist);

	}

}
