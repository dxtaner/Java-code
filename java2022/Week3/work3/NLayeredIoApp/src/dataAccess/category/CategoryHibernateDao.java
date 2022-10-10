package dataAccess.category;

import entities.Category;

public class CategoryHibernateDao implements CategoryDao {
	
	@Override
	public void add(Category category) {
		System.out.println(category.getName()+ " adli Kurs Hibernate ile eklenmiştir.");
	}

}
