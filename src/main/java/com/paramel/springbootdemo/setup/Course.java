package com.paramel.springbootdemo.setup;

public class Course {
private long id;
private String name;
private String subjectd;
@Override
public String toString() {
	return "Course [id=" + id + ", name=" + name + ", subjectd=" + subjectd + "]";
}
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getSubjectd() {
	return subjectd;
}
public void setSubjectd(String subjectd) {
	this.subjectd = subjectd;
}
public Course(long id, String name, String subjectd) {
	super();
	this.id = id;
	this.name = name;
	this.subjectd = subjectd;
}



}
