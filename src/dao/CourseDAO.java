package dao;

import java.util.List;

import model.Course;

public interface CourseDAO {
	List<Course> getAllCourses();
	boolean addCourse(Course c);
	boolean updateCourse(Course c);
	boolean removeCourse();
}
