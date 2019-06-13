package com.example.wbdvsu19Qinserverjava.models;

public class Course {
	long id;
	String title;
	String author;
	String date;
	
	
	public Course(long id, String title, String author, String date) {
		super();
		this.id = id;
		this.title = title;
		this.author = author;
		this.date = date;
	}
	public Course() {
		super();
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	

	public void setCourse(Course c) {
		this.title = c.title;
		this.author = c.author;
		this.date = c.date;
	}

	
}
