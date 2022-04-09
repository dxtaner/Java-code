
public class Engineer extends Working{
	
	private int projectID;
	
	public Engineer(String name, String surName, int salary, String department, int pID)
	{		
		super();
		setName(name);
		setSurName(surName);
		setSalary(salary);
		setDepartment(department);
		projectID = pID;
	}
		
	public int getProjectID() {
		return projectID;
	}

	public void setProjectID(int projectID) {
		this.projectID = projectID;
	}

	public double raiseCalcuate()
	{
		return 0.05*getSalary() + 350;
	}
}
