package dao;

import java.util.List;

import model.Enrollment;

public interface EnrollmentService {
	
	
	boolean addEnrollment(Enrollment enrollment);
	boolean removeEnrollment(Enrollment enrollment);
	List<Enrollment> getAll();

}
