package dataAccess.instructor;

import entities.Instructor;

public class InstructorHibernateDao implements InstructorDao {

	@Override
	public void add(Instructor instructor) {
		System.out.println(instructor.getName()+ " adli instructor Hibernate ile eklenmiştir.");		
	}
}
