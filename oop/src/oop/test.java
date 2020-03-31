package oop;

public class test {

	public static void main(String[] args) {
		
		araba araba1 = new araba();
		
		/*
	 	araba1.renk = "Kırmızı";
		araba1.model = "Pequout";
        araba1.kapilar = 4;
		araba1.tekerlekler = 4;
		
		System.out.println("arabanin modeli :"+araba1.model+"\narabain renki :"+araba1.renk+"\narabanin tekerlekleri :"
				+araba1.tekerlekler+"\narabanin kapıları :"+araba1.kapilar);
		*/
		
		araba1.setModel("ReNAULT");
		System.out.println("arabanın modeli :"+araba1.getModel());
        araba1.setKapilar(-1); 
        araba1.setKapilar(4);
        System.out.println("arabanin kapı sayısı :"+araba1.getKapilar());
        
        araba araba2=null;
        araba2.setModel("renault"); // null pointer exp hatasi
        
	}

}
