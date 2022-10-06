package javaoop;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Customer customer = new Customer();
        customer.setId(1);
        customer.setCity("Bursa");
		
		CustomerManager customerManager = new CustomerManager(customer, new TeacherCreditManager());
        customerManager.save();
        customerManager.delete();
        customerManager.giveCredit();

        Company company = new Company();
        company.setId(101);
        company.setCompanyName("Beko");
        company.setTaxNumber("187879871");
		 
        CustomerManager customerManager2 = new CustomerManager(company, new TeacherCreditManager());
        customerManager2.giveCredit();
        
        Person person = new Person();
        person.setId(12);
        person.setCity("Bursa");
        person.setFirstName("Taner");
        person.setLastName("Özer");
        person.setNationalIdentity("555214");
        
        Customer customer1 = new Customer();
        Customer customer2 = new Person();
        Customer customer3 = new Company();
        
        CreditManager creditManager = new MilitaryCreditManager();
        creditManager.calculate();
        creditManager.save();
        
	}

}
