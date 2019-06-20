package com.example.wbdvsu19Qinserverjava.controller;

import java.util.List;

import com.example.wbdvsu19Qinserverjava.repositories.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
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
	@Autowired
    CourseRepository courseRepository;
	
	// CRUD
    
    // POST - Creating
    @PostMapping("/api/courses")
    public void createCourse(@RequestBody Course course) {
         courseRepository.save(course);
    }

    // GET - Reading
    @GetMapping("/api/courses")
    public List<Course> findAllCourses() {
        return courseRepository.findAllCourse();
    }
    
    @GetMapping("/api/courses/{cid}")
    public Course findCourseById(@PathVariable("cid") Integer id) {
        return courseRepository.findCourseById(id);
    }
    
    
    // UPDATE - Updating
    @PutMapping("/api/courses/{id}")
    public void updateCourse(@PathVariable("id") Integer id, @RequestBody Course course) {
    	Course c = courseRepository.findById(id).get();
    	c.setCourse(course);
    	courseRepository.save(c);
    }


    // DELETE - Deleting
    @DeleteMapping("/api/courses/{id}")
    public void deleteCourse(@PathVariable("id") Integer id){
    	 courseRepository.deleteById(id);
    }
}
