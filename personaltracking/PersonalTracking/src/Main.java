//dxtaner
public class Main {

	public static void main(String[] args) {
		
		Fault f;
		Engineer engineer = new Engineer("Mehmet", "Durmus", 8500, "Yazilim", 11);
		Technician technician = new Technician();
		technician.setName("Ali");
		technician.setSurName("Tas");
		technician.setDepartment("Teknik");
		technician.setSalary(5400);
		
		double eZam = engineer.raiseCalcuate();
		double tZam = technician.raiseCalculate();
		
		System.out.println("Zamdan onceki muhendis maasi: " + engineer.getSalary());
		System.out.println("Muhendis zammi: "+ String.format("%.2f", eZam));
		engineer.setSalary(engineer.getSalary() + (int)eZam);
		System.out.println("Zamdan sonraki muhendis maasi: " + engineer.getSalary());
		
		System.out.println("Zamdan onceki tekniker maasi: " + technician.getSalary());
		System.out.println("Tekniker zammi: "+ String.format("%.2f", tZam));
		technician.setSalary(technician.getSalary() + (int)tZam);
		System.out.println("Zamdan sonraki tekniker maasi: " + technician.getSalary());
		
		for (int i = 0; i < 5; i++)
		{
			f = new Fault();
			f.setFaultID(i+1);
			f.setFaultUnit("Bolum " + (i+1));
			
			technician.addNewFault(f,i);
		}
		
		System.out.println("------------------------------");
		
		for (int i = 0; i < 5; i++)
		{
			f = technician.GetFault(i);
			System.out.println("Id: " + f.getFaultID() + "\tBirim: " + f.getFaultUnit());
		}

	}

}
