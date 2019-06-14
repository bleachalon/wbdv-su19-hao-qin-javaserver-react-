package com.example.wbdvsu19Qinserverjava.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.wbdvsu19Qinserverjava.models.Course;
import com.example.wbdvsu19Qinserverjava.services.CourseService;

@RestController
@CrossOrigin("*")
public class CourseController {
	CourseService cou = new CourseService();
	
	// CRUD
    
    // POST - Creating 
    @PostMapping("/api/courses")
    public void createCourse(@RequestBody Course course) {
         cou.createCourse(course);
    }
    
    // GET - Reading
    @GetMapping("/api/courses")
    public List<Course> findAllCourses() {
        return cou.findAllCourses();
    }
    
    @GetMapping("/api/Courses/{id}")
    public Course findCourseById(@PathVariable("id") long id) {
    	return cou.findCourseById(id);
    }
    
    
    // UPDATE - Updating
    @PutMapping("/api/courses/{id}")
    public void updateCourse(@PathVariable("id") long id, @RequestBody Course Course) {
    	 cou.updateCourse(id, Course);
    }
    
    
    // DELETE - Deleting
    @DeleteMapping("/api/courses/{id}")
    public void deleteCourse(@PathVariable("id") long id){
    	 cou.deleteCourse(id);
    }
}
