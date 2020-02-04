import java.util.*;

public class Main {

	public static void main(String[] args) {
		List liste=new ArrayList();
		liste.add("Bursa");
		liste.add("İzmir");
		liste.add("Manisa");
		liste.add("Ankara");
		System.out.println("1. liste: \n"+liste);
		System.out.println("3: "+liste.get(3));
		System.out.println("2: "+liste.get(2));
		
		List liste2=new ArrayList();
		liste2.add(liste);
		System.out.println("2.liste: \n"+liste2);
		
		System.out.println(liste2.isEmpty());
		System.out.println(liste2.contains("İzmir"));
		System.out.println(liste.contains("İzmir"));
		
		liste.remove(3);
		System.out.println("liste 1: \n"+liste);
		
		liste2.clear();
		System.out.println("liste 2: \n"+liste2);
	}

}
