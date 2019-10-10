package model;

public class Enrollment {
	
	private String enrollmentId;
	private String studentID;
	private String batchId;
	
	public Enrollment() {
		
	}
	public Enrollment(String enrollmentId, String studentID, String batchId) {
		super();
		this.enrollmentId = enrollmentId;
		this.studentID = studentID;
		this.batchId = batchId;
	}
	public String getEnrollmentId() {
		return enrollmentId;
	}
	public void setEnrollmentId(String enrollmentId) {
		this.enrollmentId = enrollmentId;
	}
	public String getStudentID() {
		return studentID;
	}
	public void setStudentID(String studentID) {
		this.studentID = studentID;
	}
	public String getBatchId() {
		return batchId;
	}
	public void setBatchId(String batchId) {
		this.batchId = batchId;
	}
	

}
