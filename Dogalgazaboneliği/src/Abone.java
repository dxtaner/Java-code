
public class Abone {
	public String isim;
	public int bakiye;
	public String sehir;
	
	
	public void dogalgazKullan(int miktar){
		
		if(this.bakiye<miktar){
			System.out.println("Yeterli bakiye yokk..");
		}
		else {
			bakiye-=miktar;
			
			if(bakiye < 0){
				System.out.println("Bakiyeniz bitti . Kredi Yukleyin.."
						+ "(Kredi limiti 120 Tl dir.");
 			}
			else{
				System.out.println("Yeni bakiye :"+bakiye);
			}
		}
	}

	public void bakiyeOgren(){
		System.out.println("Bakiye :"+bakiye);
	}
}
