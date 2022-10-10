package business;

import java.util.List;

import core.logging.Logger;
import dataAccess.course.CourseDao;
import entities.Course;

public class CourseManager {
	private CourseDao courseDao;
	private Logger[] loggers;
	private List<Course> courses;
	
	public CourseManager(CourseDao courseDao, Logger[] loggers,List<Course> courses) {
		this.courseDao = courseDao;
		this.loggers = loggers;
		this.courses = courses;
	}

	public void add(Course course) throws Exception {
		if (course.getPrice() < 0) {
			throw new Exception("Kurs fiyatı sıfırdan küçük olamaz!!");
		}
		for (Course courseOne : courses) {
			if(course.getName().equals(courseOne.getName())) {
				  throw new Exception ("Kurs ismi aynı olamaz"); 
			}
			courseDao.add(course);
			courses.add(course);
		}		
		for (Logger logger : loggers) { 
			logger.log(course.getName());
		}
	}
	
}
