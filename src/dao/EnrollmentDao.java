package dao;

import model.Enrollment;
import java.util.List;

public interface EnrollmentDao {
	
	boolean addEnrollment(Enrollment enrollment);
	boolean removeEnrollment(Enrollment enrollment);
	List<Enrollment> getAll();
	
	

}
