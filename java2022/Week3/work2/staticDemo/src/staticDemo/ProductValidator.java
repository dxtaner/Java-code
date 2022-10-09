package staticDemo;

public class ProductValidator {
	static {
		System.out.println("Yapıcı blok çalıştı.");
	}

	public ProductValidator() {
		System.out.println("Yapıcı blok çalıştı.");

	}
	public static boolean isValid(Product product) {
        if (product.price > 0 && !product.name.isEmpty()) {
            return true;
        }
        return false;
    }
	
	public void bisey() {

	}
}
