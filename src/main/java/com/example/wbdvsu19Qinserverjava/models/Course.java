package com.example.wbdvsu19Qinserverjava.models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name= "Courses")
public class Course {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String title;
	private String author;
	private String date;
	@OneToMany(mappedBy = "course")
	private List<Module> Modules;
	
	public Course(Integer id, String title, String author, String date) {
		super();
		this.id = id;
		this.title = title;
		this.author = author;
		this.date = date;
	}


	public List<Module> getModules() {
		return Modules;
	}

	public void setModules(List<Module> modules) {
		Modules = modules;
	}
	public Course() {
		super();
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
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
