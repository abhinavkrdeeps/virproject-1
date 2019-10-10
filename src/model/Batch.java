package model;

import java.sql.Date;

public class Batch {
	
	private String batchId;
	private String trainerId;
	private String courseId;
	private double fees;
	private Date startdate;
	private Date endDate;
	private Integer noOfStudents; 
	private String batchName;
	
	
	public Batch() {
		super();
		// TODO Auto-generated constructor stub
	}


	
	public Batch(String batchId, String trainerId, String courseId, double fees, Date startdate, Date endDate,
			Integer noOfStudents, String batchName) {
		super();
		this.batchId = batchId;
		this.trainerId = trainerId;
		this.courseId = courseId;
		this.fees = fees;
		this.startdate = startdate;
		this.endDate = endDate;
		this.noOfStudents = noOfStudents;
		this.batchName = batchName;
	}



	public String getCourseId() {
		return courseId;
	}



	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}



	public double getFees() {
		return fees;
	}



	public void setFees(double fees) {
		this.fees = fees;
	}



	public Date getStartdate() {
		return startdate;
	}



	public void setStartdate(Date startdate) {
		this.startdate = startdate;
	}



	public Date getEndDate() {
		return endDate;
	}



	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}



	public Integer getNoOfStudents() {
		return noOfStudents;
	}



	public void setNoOfStudents(Integer noOfStudents) {
		this.noOfStudents = noOfStudents;
	}



	public String getBatchId() {
		return batchId;
	}


	public void setBatchId(String batchId) {
		this.batchId = batchId;
	}


	public String getTrainerId() {
		return trainerId;
	}


	public void setTrainerId(String trainerId) {
		this.trainerId = trainerId;
	}


	public String getBatchName() {
		return batchName;
	}


	public void setBatchName(String batchName) {
		this.batchName = batchName;
	}
	
	
	
	

}
