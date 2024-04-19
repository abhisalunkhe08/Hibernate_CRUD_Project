package com.sit.entity;

public class Student {
    private int id;
    private String name;
    private int marks;
    private int rollNo;
    public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student( String name, int marks, int rollno) {
		super();
		
		this.name = name;
		this.marks = marks;
		this.rollno = rollno;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", marks=" + marks + ", rollno=" + rollno + "]";
	}
	
}
