import java.awt.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Calendar;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ArrayList<Personel> personelListesi = new ArrayList<Personel>();
		Personel p;
		int pID;
		
		while(1==1){
			System.out.println((personelListesi.size()+1)+". personelin ID'si :");
			System.out.println("[Eklemeyi bitirmek icin -1 giriniz:");
			pID=sc.nextInt();
			if(pID==-1){
				break;
			}
			else{
				sc.nextLine();
				p = new Personel();
				p.setpID(pID);
				System.out.println((personelListesi.size()+1)+". personelin adsoyadý :");
				p.setAdSoyad(sc.nextLine());
				System.out.println((personelListesi.size()+1)+". personelin maasi :");
				p.setMaas(sc.nextDouble());
				System.out.println((personelListesi.size()+1)+". personelin ise giris tarihi :");
				p.setGirisYili(sc.nextInt());
				
				personelListesi.add(p);
			}
			
		}
		System.out.println("Zamdan Önce Maas Listesi:");
		Listele(personelListesi);
		
		Zamla(personelListesi);
	
		System.out.println("Zamdan Sonraki Maas Listesi:");
		Listele(personelListesi);

	}
	
	private static void Zamla(ArrayList<Personel> personelListesi){
		
		int buSene = Calendar.getInstance().get(Calendar.YEAR);
		Personel p;
		for (int i = 0; i < personelListesi.size(); i++)
		{
			p = personelListesi.get(i);
			
			if( (buSene-p.getGirisYili() >= 10)){
				
				p.setMaas(p.getMaas()+500);
			}
			else if(buSene-p.getGirisYili()>=5){
				
				p.setMaas(p.getMaas()+250);
			}
			if(p.getMaas()<3500){
					p.setMaas(p.getMaas()+150);
			}
		
				
		}
		
	}
	
	private static void Listele(ArrayList<Personel> personelListesi){
		for (Personel personel : personelListesi) {
			System.out.println("Ad soyad :"+personel.getAdSoyad()+" maas :"+String.format("%.2f", personel.getMaas())
					+" ise giris yili:"+personel.getGirisYili());
		}
		
	}

}
