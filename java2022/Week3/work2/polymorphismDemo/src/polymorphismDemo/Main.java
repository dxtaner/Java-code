package polymorphismDemo;

public class Main {
	
	  public static void main(String[] args) {

	        CustomerManager customerManager = new CustomerManager(new DatabaseLogger());
	        CustomerManager customerManager1 = new CustomerManager(new FileLogger());
	        CustomerManager customerManager2 = new CustomerManager(new EmailLogger());
	        customerManager.add();
	        customerManager1.add();
	        customerManager2.add();

	    }

}
