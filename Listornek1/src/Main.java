import java.util.*;
//dxtaner
public class Main {

	public static void main(String[] args) {
	
		String[] harfler={"A","C","T","B","D","R"};
		List<String> h_liste=new ArrayList<String>();
		
		for (String harf : harfler) {
			h_liste.add(harf);
		}

		System.out.println(" liste elemanlar� s�ral�.");
		System.out.println(h_liste);
		
		System.out.println(" rasgele kar��t�r�lm�� liste."); 
		Collections.shuffle(h_liste,new Random());
		System.out.println(h_liste);
		
	}

}
