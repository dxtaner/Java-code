package dataAccess.category;

import entities.Category;

public class CategoryJdbcDao implements CategoryDao {

	@Override
	public void add(Category category) {
		System.out.println(category.getName()+ " adli Kurs Jdbc ile eklenmiştir.");
	}

}
