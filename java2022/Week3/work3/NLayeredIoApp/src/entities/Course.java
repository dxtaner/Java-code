package entities;

public class Course {
	private int id;
	private String name;
	private int price;
	private Category category;
	private Instructor instuctor;
	
	
	public Course() {
		super();
	}

	public Course(int id, String name, int price, Category category,
			Instructor instuctor) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.category = category;
		this.instuctor = instuctor;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public Instructor getInstuctor() {
		return instuctor;
	}

	public void setInstuctor(Instructor instuctor) {
		this.instuctor = instuctor;
	}
	
}
