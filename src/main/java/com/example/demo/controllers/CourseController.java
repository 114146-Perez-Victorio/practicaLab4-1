package com.example.demo.controllers;

import com.example.demo.models.Course;
import com.example.demo.services.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/courses")
public class CourseController {

    @Autowired
    CourseService courseService;

    //GetForObject
    @GetMapping("/getAllCourses")
    public ResponseEntity<List<Course>> getCourse(){
        return new ResponseEntity<>(courseService.getCourses(), HttpStatus.OK);
    }

    //GetForEntity
    @GetMapping("/getAllCoursesEntity")
    public Course[] getCourseEntity(){
        return courseService.getCoursesEntity();
    }

    @GetMapping("/getByID/{ID}")
    public Course getByID(@PathVariable String ID){
        return courseService.getByID(ID);
    }


}
