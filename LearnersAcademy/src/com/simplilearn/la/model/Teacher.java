package com.simplilearn.la.model;

public class Teacher {

	public String teacherId;
	public String teacherFullName;
	public int age;
	public String city;
	public String state;
	public String country;
	public String address;
	public String emailId;
	public String mobileNumber;
	public String getTeacherId() {
		return teacherId;
	}
	public void setTeacherId(String teacherId) {
		this.teacherId = teacherId;
	}
	public String getTeacherFullName() {
		return teacherFullName;
	}
	public void setTeacherFullName(String teacherFullName) {
		this.teacherFullName = teacherFullName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public Teacher(String teacherId, String teacherFullName, int age, String city, String state, String country,
			String address, String emailId, String mobileNumber) {
		super();
		this.teacherId = teacherId;
		this.teacherFullName = teacherFullName;
		this.age = age;
		this.city = city;
		this.state = state;
		this.country = country;
		this.address = address;
		this.emailId = emailId;
		this.mobileNumber = mobileNumber;
	}

	
}
