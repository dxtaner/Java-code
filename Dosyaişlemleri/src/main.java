import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		String d_adi="C:\\Users\\Taner\\workspace\\dosya.txt";
		List<Eleman> eList = dosyadanOku(d_adi);
		
		if(eList.size() > 0)
		{
			listeyiYazdir(eList);
			
			maasGuncelle(eList);
			
			listeyiYazdir(eList);
			
			dosyayaYaz(d_adi, eList);
		}
		
	}

	private static List<Eleman> dosyadanOku(String d_adi){
		List<Eleman> eL = new ArrayList<Eleman>();
		Eleman e;
		File dosya = new File(d_adi);
		
		if(dosya.exists()){
			try{
				Scanner scanner= new Scanner(dosya);
				while(scanner.hasNextLine()){
					e=new Eleman();
					e.setAd(scanner.next());
					e.setSoyad(scanner.next());
					e.setMaas(scanner.nextDouble());
					eL.add(e);
				}
				scanner.close();
				System.out.println("Okunan veri sayisi:"+eL.size());
			}
			catch(Exception ex){
				eL.clear();
				ex.printStackTrace();
				System.out.println("Okumada hata olustu..");
			}
		}
		else{
			System.out.println("Dosya bulunamadi..");
		}
		
		return eL;

	}
	
	private static void dosyayaYaz(String dosyaAdi, List<Eleman> eL)
	{
		try {
			PrintWriter pw = new PrintWriter(new FileOutputStream(dosyaAdi));
			for(Eleman e:eL)
			{
				pw.println(e.getAd() + " " + e.getSoyad() + " " + e.getMaas());
			}
			pw.close();
			System.out.println("Elemanlar dosyaya yazildi.");
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void listeyiYazdir(List<Eleman> eL)
	{
		System.out.println("\nEleman Listesi");
		for(Eleman e: eL)
		{
			System.out.println(e.getAd() + " " + e.getSoyad() 
										  + " " + String.format("%.2f", e.getMaas()));
		}
		System.out.println("\n");
	}

	private static void maasGuncelle(List<Eleman> eL)
	{
		for(Eleman e: eL)
		{
			e.setMaas(e.getMaas() + e.getMaas()*0.1);
		}
		System.out.println("Eleman maaslari guncellendi!");
	}
	
}
