package dataAccess.course;

import entities.Course;

public class CourseJdbcDao implements CourseDao {

	@Override
	public void add(Course course) {
		System.out.println(course.getName()+ " adli course Jdbc ile eklenmiştir.");
	}

}
