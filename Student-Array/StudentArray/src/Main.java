import java.util.Scanner;

//dxtaner
public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int stdNb;
		
		System.out.print("Kac ogrenci girilecek:");
		stdNb = sc.nextInt();
		
		Student [] students = new Student[stdNb];
		
		for (int i = 0; i < stdNb; i++)
		{
			students[i] = new Student();
			sc.nextLine();
			students[i].setStdNo(1000+i);
			
			System.out.print("Ogr Adi: ");
			students[i].setStdName(sc.nextLine());
			
			System.out.print("Ogr Soyadi: ");
			students[i].setStdSurname(sc.next());
			
			students[i].setStdDepartment("Bilgisayar Muhendisligi");
		}
		
		for (int i = 0; i < students.length; i++)
		{
			System.out.println((i+1) + ".--------------------------");
			System.out.println("Ogr No: " + students[i].getStdNo()
								+ "\nOgr Ad: " + students[i].getStdName()
								+ "\nOgr Soyad: " + students[i].getStdSurname()
								+ "\nOgr Bolum: " + students[i].getStdDepartment());
		}

	}

}
