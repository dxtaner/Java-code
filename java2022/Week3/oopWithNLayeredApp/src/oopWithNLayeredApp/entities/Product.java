package oopWithNLayeredApp.entities;

public class Product {

	private int id;
	private String name;
	private double unitPrice;
	
	public Product() {
		super();
	}

	public Product(int id, String name, double unitPrice) {
		super();
		this.id = id;
		this.name = name;
		this.unitPrice = unitPrice;
	}

	public int getID() {
		return id;
	}

	public void setID(int id) {
		id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}
	
	
}
