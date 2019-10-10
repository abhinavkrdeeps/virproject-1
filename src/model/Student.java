package model;

public class Student {
	private String sid;
	private String name;
	private String email;
	private String contact;
	private String fathersName;
	private String aadharID;
	private Integer age;
	private String userName;
	private String password;
	
	
	
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(String sid, String name, String email, String contact, String fathersName, String aadharID,
			Integer age, String userName, String password) {
		super();
		this.sid = sid;
		this.name = name;
		this.email = email;
		this.contact = contact;
		this.fathersName = fathersName;
		this.aadharID = aadharID;
		this.age = age;
		this.userName = userName;
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	
	
	
	public String getSid() {
		return sid;
	}

	public void setSid(String sid) {
		this.sid = sid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFathersName() {
		return fathersName;
	}

	public void setFathersName(String fathersName) {
		this.fathersName = fathersName;
	}

	public String getAadharID() {
		return aadharID;
	}

	public void setAadharID(String aadharID) {
		this.aadharID = aadharID;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", name=" + name + ", fathersName=" + fathersName + ", aadharID=" + aadharID
				+ ", age=" + age + ", userName=" + userName + "]";
	}
	
	
	


}
