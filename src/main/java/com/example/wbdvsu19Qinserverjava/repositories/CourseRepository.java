package com.example.wbdvsu19Qinserverjava.repositories;

import com.example.wbdvsu19Qinserverjava.models.Course;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CourseRepository extends CrudRepository<Course, Integer> {

    @Query("select course from Course course")
    public List<Course> findAllCourse();

    @Query("select course from Course course where course.id=:cid")
    public Course findCourseById(@Param("cid") Integer id);
}
