package dao;

import java.util.List;

import model.Student;

public interface StudentService {
	
	Student findById(String id);
	List<Student> getAllStudents();
	boolean addStudent(Student student);
	boolean removeStudent(Student student);
	boolean updateStudent(Student student);

}
