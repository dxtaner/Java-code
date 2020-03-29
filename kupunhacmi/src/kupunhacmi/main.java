package kupunhacmi;
import java.util.Scanner;
//dxtaner
public class main {

	public static void main(String[] args) {
		int a;
		Scanner sc = new Scanner(System.in);
		System.out.println("A degeri giriniz :");
		if(sc.hasNextInt()){
			a=sc.nextInt();
			if(a<0){
				System.out.println("Pozitif tamsayi giriniz");
				}
			else{
				System.out.println("Kupun hacmi: "+a*a*a);
				System.out.println("Kupun alani: "+a*a*6);
				}
			}
		else{
			System.out.println("Ýnteger deger giriniz");
			}
	}

}
