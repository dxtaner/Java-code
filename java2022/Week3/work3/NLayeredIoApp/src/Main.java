
import java.util.ArrayList;
import java.util.List;

import business.CategoryManager;
import business.CourseManager;
import business.InstructorManager;
import core.logging.Logger;
import core.logging.MailLogger;
import dataAccess.category.CategoryJdbcDao;
import dataAccess.course.CourseJdbcDao;
import dataAccess.instructor.InstructorHibernateDao;
import entities.Category;
import entities.Course;
import entities.Instructor;

public class Main {

	public static void main(String[] args) throws Exception {

		Category category1 = new Category(1,"Yazılım");
		Category category2 = new Category(2,"Photoshop");
		Category category3 = new Category(3,"Dil");
		List<Category> categories = new ArrayList<>();
		
		Instructor instructor1 = new Instructor(1,"Rondal","Ylzdi");
		Instructor instructor2 = new Instructor(2,"Erdi","Hakna");
		Instructor instructor3 = new Instructor(3,"Sorgan","Emrız");
		List<Instructor> instructors = new ArrayList<>();

        Course course1 = new Course(1, "Python",250,category1,instructor1);
        //Course course2 = new Course(2, "Java",-2,category3,instructor2);
        Course course2 = new Course(2, "Java",0,category3,instructor2);
        Course course3 = new Course(3, "İngilizce",250,category2,instructor3);
		List<Course> courses = new ArrayList<>();
		//courses.add(course1); //  kurs isminin aynı olma hatası

		//Logger[] loggers = {new DatabaseLogger(),new FileLogger(), new MailLogger()};
		Logger[] loggers = { new MailLogger()};

		InstructorManager instructorManager = new InstructorManager(new InstructorHibernateDao(),loggers);
		instructorManager.add(instructor1);
		instructorManager.add(instructor2);
		instructorManager.add(instructor3);
		
		CourseManager courseManager = new CourseManager(new CourseJdbcDao(), loggers, courses);
		courseManager.add(course1);
		courseManager.add(course2);
		courseManager.add(course3);
		
		CategoryManager categoryManager = new CategoryManager(new CategoryJdbcDao(), loggers, categories);
		categoryManager.add(category1);
		categoryManager.add(category2);
		categoryManager.add(category3);
		
	}

}
