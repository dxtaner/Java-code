package oop1;

public class Main {

	public static void main(String[] args) {

		Product product1 = new Product();
		product1.setName("Delonghi Kahve Makinasi");
		product1.setDiscount(6);
		product1.setUnitPrice(30000);
		product1.setDiscount(20);
		product1.setImageUrl("image.jpg");
		
		// System.out.println(product1.name);
		
		Product product2 = new Product();
		product2.setName("Smeg Kahve Makinasi");
		product2.setDiscount(6);
		product2.setUnitPrice(30000);
		product2.setDiscount(20);
		product2.setImageUrl("image.jpg");
		
		Product product3 = new Product();
		product3.setName("Kitchen Kahve Makinasi");
		product3.setDiscount(6);
		product3.setUnitPrice(30000);
		product3.setDiscount(20);
		product3.setImageUrl("image.jpg");
		
		Product[] products = {product1,product2,product3};
		
		System.out.println("<ul>");
		for (Product product : products) {
			System.out.println("<li>Product Name:"+product.getName()+"</li>");
			
		}
		System.out.println("</ul>");
		
		IndividualCustomer individulaCustomer = new IndividualCustomer();
		individulaCustomer.setId(1);
		individulaCustomer.setPhone("0556666");
		individulaCustomer.setCustomerNumber("1125");
		individulaCustomer.setFirstName("Taner");
		individulaCustomer.setLastName("Özer");
		
		CorporateCustomer corporateCustomer = new CorporateCustomer();
		corporateCustomer.setId(1);
		corporateCustomer.setPhone("095555555");
		corporateCustomer.setCustomerNumber("444");
		corporateCustomer.setCompanyName("number1");
		corporateCustomer.setTaxNumber("555");
		
		Customer[] customers = {individulaCustomer,corporateCustomer};
		
		
	}

}
