package staticDemo;

public class ProductManager {
	 public void addProduct(Product product) {
	        if (ProductValidator.isValid(product)) {
	            System.out.println("Ürün Eklendi");
	        } else {
	            System.out.println("Ürün Bilgileri Geçersizdir");
	        }
	    }

	public void add(Product product) {
		// TODO Auto-generated method stub
		
	}
}
