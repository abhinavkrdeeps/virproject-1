package dao;

import model.Enrollment;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import connection.DBConnection;

public class EnrollmentDaoImpl implements EnrollmentDao {
	
	private static final String ADD_ENROLLMENT = "insert into enrollment values(?,?,?)";
	private static final String REMOVE_ENROLLMENT = "delete from enrollment where enrollment_id=?";
	private static final String GET_ALL_ENROLLMENT = "select * from enrollment";
	
	public static Connection connection = DBConnection.getConn();
	PreparedStatement preparedStatement = null;
	ResultSet resultSet = null;

	@Override
	public boolean addEnrollment(Enrollment enrollment) {
		
			
		try {
			preparedStatement = connection.prepareStatement(ADD_ENROLLMENT);
			preparedStatement.setString(1,enrollment.getBatchId());
			preparedStatement.setString(2, enrollment.getEnrollmentId());
			preparedStatement.setString(3,enrollment.getStudentID());
			preparedStatement.execute();
			connection.commit();
			return true;

		}catch(Exception e)
		{
		  return false;	
		}finally {
			try {
				preparedStatement.close();
			} catch (SQLException e) {
			
				e.printStackTrace();
			}
		}
		//return false;
	}

	@Override
	public boolean removeEnrollment(Enrollment enrollment) {
		
		try {
			preparedStatement = connection.prepareStatement(REMOVE_ENROLLMENT);
			preparedStatement.setString(1,enrollment.getEnrollmentId());
			preparedStatement.execute();
			connection.commit();
			return true;
			
		}catch(Exception e)
		{
			return false;
		}
		
		//return false;
	}

	@Override
	public List<Enrollment> getAll() {
		ArrayList<Enrollment> enrollmentList = new ArrayList<>();
		Enrollment enrollment =null;
		try {
			preparedStatement = connection.prepareStatement(GET_ALL_ENROLLMENT);
			ResultSet resultSet = preparedStatement.executeQuery();
			while(resultSet.next())
			{
				enrollment.setBatchId(resultSet.getString(1));
				enrollment.setEnrollmentId(resultSet.getString(2));
				enrollment.setStudentID(resultSet.getString(3));
				enrollmentList.add(enrollment);
			}
			return enrollmentList;
		}catch(Exception e)
		{
			return null;
		}finally {
			try {
				preparedStatement.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}

}
