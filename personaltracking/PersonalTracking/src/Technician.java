
public class Technician extends Working{
	
	private Fault faults[] = new Fault[5];
	
	public void addNewFault(Fault fault, int i)
	{
		faults[i] = fault;
	}
	
	public Fault GetFault(int i)
	{
		return faults[i];
	}
}
