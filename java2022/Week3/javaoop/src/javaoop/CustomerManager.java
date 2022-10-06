package javaoop;

public class CustomerManager {

	private Customer _customer;
	private BaseCreditManager creditManager;
	
	public CustomerManager(Customer customer, BaseCreditManager  creditManager) {
		this._customer=customer;
		this.creditManager=creditManager;
	}
	
	public void giveCredit() {
		System.out.println("Customer is given credit");
		creditManager.calculate();
	}
	
	public void save() {
		System.out.println("Customer Saved: ");
	}
	
	public void delete() {
		System.out.println("Customer Removed");
	}

}
