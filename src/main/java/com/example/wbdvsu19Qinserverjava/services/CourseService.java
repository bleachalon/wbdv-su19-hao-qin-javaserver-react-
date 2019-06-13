package com.example.wbdvsu19Qinserverjava.services;

import java.util.ArrayList;
import java.util.List;

import com.example.wbdvsu19Qinserverjava.models.Course;

public class CourseService {
	 List<Course> courses = new ArrayList<Course>();
	 
	 {
		 courses.add(new Course(1,"CS5004", "Alan", "00-00-0000"));
		 courses.add(new Course(2,"CS5005", "Alan", "00-00-0000"));
		 courses.add(new Course(3,"CS5006", "Alan", "00-00-0000"));
		 courses.add(new Course(4, "CS5007", "Alan", "00-00-0000"));
	 }
	 
	 
	 public List<Course> createCourse(Course course) {
	    	courses.add(course);
	    	
	    	return courses;
	    }
	    
	    
	    public List<Course> findAllCourses() {
	    	return courses;
	    }
	    
	    public Course findCourseById(long id) {
	    	for(Course w: courses) {
	    		if(w.getId()==id) {
	    			return w;
	    		}
	    	}
	    	return null;
	    }
	    
	    
	    public List<Course> updateCourse(long id, Course course){
	    	
	    	for(int i=0; i<courses.size(); i++) {
	    		if(courses.get(i).getId()==id) {
	    			courses.get(i).setCourse(course);
	    			return courses;
	    		}
	    	}
	    	return null;
	    }
	    
	    
	    public List<Course> deleteCourse(long id) {
	    	for(int i=0; i<courses.size(); i++) {
	    		if(courses.get(i).getId()==id) {
	    			courses.remove(i);
	    		}
	    	}
	    	return courses;
	    }
	    
}
