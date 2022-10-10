package business;

import java.util.List;

import core.logging.Logger;
import dataAccess.category.CategoryDao;
import entities.Category;

public class CategoryManager {
	
	private CategoryDao categoryDao;
	private Logger[] loggers;
	private List<Category> categories;
	
	public CategoryManager(CategoryDao categoryDao, Logger[] loggers,List<Category> categories) {
		this.categoryDao = categoryDao;
		this.loggers = loggers;
		this.categories = categories;
	}

	public void add(Category category) throws Exception {
		for (Category c : categories) {
			if (category.getName().equals(c.getName())) {
				  throw new Exception ("Kategori ismi aynı olamaz"); 
			}
			categoryDao.add(category);
			categories.add(category);
		}
		
		for (Logger logger : loggers) { 
			logger.log(category.getName());
		}
	
	}
	
	
}
