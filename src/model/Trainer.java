package model;

public class Trainer {
	
	private String trainerID;
	private String trainerName;
	private String username;
	private String password;
	private String email;
	private Integer yrsOfExperience;
	private String aadharId;
	private String specialization;
	private String contact;
	
	public Trainer() {
		
	}

	public Trainer(String trainerID, String trainerName, Integer yrsOfExperience, String aadharId,
			String specialization) {
		super();
		this.trainerID = trainerID;
		this.trainerName = trainerName;
		this.yrsOfExperience = yrsOfExperience;
		this.aadharId = aadharId;
		this.specialization = specialization;
	}

	public String getTrainerID() {
		return trainerID;
	}

	public void setTrainerID(String trainerID) {
		this.trainerID = trainerID;
	}

	public String getTrainerName() {
		return trainerName;
	}

	public void setTrainerName(String trainerName) {
		this.trainerName = trainerName;
	}

	public Integer getYrsOfExperience() {
		return yrsOfExperience;
	}

	public void setYrsOfExperience(Integer yrsOfExperience) {
		this.yrsOfExperience = yrsOfExperience;
	}

	public String getAadharId() {
		return aadharId;
	}

	public void setAadharId(String aadharId) {
		this.aadharId = aadharId;
	}

	public String getSpecialization() {
		return specialization;
	}

	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}
	
	
}
