package staticDemo;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ProductManager productManager = new ProductManager();
		Product product =new Product();
		product.price=10;
		product.name="Mouse";
		
		productManager.add(product);
        DatabaseHelper.Connection.createConnection();

	}

}
