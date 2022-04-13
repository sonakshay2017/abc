package com.example.demo.model;

public class Student 
{
	private String sname;
	private String password;
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Student(String sname, String password) {
		super();
		this.sname = sname;
		this.password = password;
	}
	
	public Student()
	{}
}
