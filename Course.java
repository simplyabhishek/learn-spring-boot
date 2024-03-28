package com.in28minutes.springboot.learnspringboot;

public class Course {
	private long id;
	private String courseName;
	private String author;
	
	public Course(long id,String course,String author){
		this.id = id;
		this.courseName = course;
		this.author = author;
	}

	public long getId() {
		return id;
	}

	public String getCourseName() {
		return courseName;
	}

	public String getAuthor() {
		return author;
	}

	@Override
	public String toString() {
		return "Course [id=" + id + ", courseName=" + courseName + ", author=" + author + "]";
	}
	
}
