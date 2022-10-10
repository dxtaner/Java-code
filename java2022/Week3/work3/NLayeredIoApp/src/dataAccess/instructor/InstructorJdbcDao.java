package dataAccess.instructor;


import entities.Instructor;

public class InstructorJdbcDao implements InstructorDao {

	@Override
	public void add(Instructor instructor) {
		System.out.println(instructor.getName()+ " adli eğitmen Jdbc ile eklenmiştir.");		
	}
}
