package dataAccess.course;

import entities.Course;

public class CourseHibernateDao implements CourseDao{

	@Override
	public void add(Course course) {
		System.out.println(course.getName()+ " adli course Hibernate ile eklenmiştir.");		
	}

}
